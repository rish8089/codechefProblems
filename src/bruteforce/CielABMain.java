package bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CielABMain {
    public static void main(String args[]) throws IOException {

        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        CielAB ob=new CielAB(br);
        String s=br.readLine();
        String AB[]=s.split(" ");
        int A=Integer.parseInt(AB[0]);
        int B=Integer.parseInt(AB[1]);
        ob.processInput(A,B);
        System.out.println(ob.getIncorrectDiff());
    }
}
