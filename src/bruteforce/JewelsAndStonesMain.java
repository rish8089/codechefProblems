package bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JewelsAndStonesMain {

    public static void main(String[] args) throws IOException {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        JewelsAndStones ob=new JewelsAndStones(br);
        int T=Integer.parseInt(br.readLine());
        while(T>0)
        {
            ob.processInput(br.readLine(),br.readLine());
            System.out.println(ob.calculateNoOfJewels());
            T--;
        }
    }
}
