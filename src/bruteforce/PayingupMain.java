package bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PayingupMain {
    public static void main(String args[]) throws IOException {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        Payingup p=new Payingup(br);
        int n,m;
        int T;
        T=Integer.parseInt(br.readLine());
        while(T>0) {
           String s=br.readLine();
           String sArr[]=s.split(" ");
           p.processInput(Integer.parseInt(sArr[0]),Integer.parseInt(sArr[1]));
           p.willRobberyBePossible();
           T--;
        }



    }
}
