package bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TheBestBoxMain {

    public static void main(String args[]) throws IOException {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        TheBestBox ob=new TheBestBox(br);
        int T;
        T=Integer.parseInt(br.readLine());
        while(T>0)
        {
            String str=br.readLine();
            String strArr[]=str.split(" ");
            ob.processInput(Integer.parseInt(strArr[0]),Integer.parseInt(strArr[1]));
            System.out.format("%.2f",ob.maximumVolume());
            System.out.println();
            T--;
        }
    }
}
