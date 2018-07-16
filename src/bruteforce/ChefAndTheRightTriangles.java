package bruteforce;

import java.io.BufferedReader;
import java.io.IOException;

public class ChefAndTheRightTriangles {

    BufferedReader br;
    int numberOfRightAngledTriangles=0;
    ChefAndTheRightTriangles(BufferedReader br)
    {
        this.br=br;
    }

    public void processInput(int N) throws IOException {
        int x1,y1,x2,y2,x3,y3;
        for(int i=1;i<=N;i++)
        {
            String str=br.readLine();
            String strArr[]=str.split(" ");
            x1=Integer.parseInt(strArr[0]);
            y1=Integer.parseInt(strArr[1]);
            x2=Integer.parseInt(strArr[2]);
            y2=Integer.parseInt(strArr[3]);
            x3=Integer.parseInt(strArr[4]);
            y3=Integer.parseInt(strArr[5]);

            int d1=abs(x2-x1)*abs(x2-x1)+abs(y2-y1)*abs(y2-y1);
            int d2=abs(x3-x1)*abs(x3-x1)+abs(y3-y1)*abs(y3-y1);
            int d3=abs(x3-x2)*abs(x3-x2)+abs(y3-y2)*abs(y3-y2);

            if(d1+d3==d2 || d2+d3==d1 || d1+d2==d3)
                numberOfRightAngledTriangles+=1;



        }
    }

    public int getNoOfRightAngledTriangles()
    {
        return numberOfRightAngledTriangles;
    }

    int abs(int a)
    {
        return a<0?-a:a;
    }
}
