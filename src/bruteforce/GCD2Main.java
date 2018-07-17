package bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GCD2Main {

    public static void main(String[] args) throws IOException {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        int T=Integer.parseInt(br.readLine());
        GCD2 ob=new GCD2(br);
        while(T>0)
        {
            ob.processInput();
            ob.getGCD();
            T--;
        }
    }
}
