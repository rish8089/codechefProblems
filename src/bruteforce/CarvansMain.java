package bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CarvansMain {

    public  static void main(String args[]) throws IOException {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        Carvans ob=new Carvans(br);
        int T=Integer.parseInt(br. readLine());
        while(T>0)
        {
            ob.processInput(Integer.parseInt(br.readLine()));
            System.out.println(ob.getCarsWithMaximumSpeed());
            T--;
        }
    }
}
