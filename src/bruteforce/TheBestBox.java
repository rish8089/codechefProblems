package bruteforce;

import java.io.BufferedReader;

public class TheBestBox {

    BufferedReader br;

    TheBestBox(BufferedReader br)
    {
        this.br=br;
    }
    int P,S;
    public void processInput(int P,int S)
    {
        this.P=P;
        this.S=S;
    }

    public double maximumVolume()
    {
        double x,y,a1,a2;

        x=P/4.0;
        y=S/2.0;

        a1=(x+Math.sqrt(x*x-3*y))/3;
        a2=(x-Math.sqrt(x*x-3*y))/3;

        if(a1>=0 && a2>=0)
            return Math.max(a1*(y-a1*x+a1*a1),a2*(y-a2*x+a2*a2));
        else if(a1>=0)
            return a1*(y-a1*x+a1*a1);
        else
            return a2*(y-a2*x+a2*a2);

    }
}
