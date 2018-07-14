package bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NuclearReactorMain {
    public static void main(String args[]) throws IOException {
       long  A,N,K;
       InputStreamReader isr=new InputStreamReader(System.in);
       BufferedReader br=new BufferedReader(isr);

       NuclearReactor ob=new NuclearReactor(br);
       String s=br.readLine();
       String strArr[]=s.split(" ");
       ob.processInput(Integer.parseInt(strArr[0]),Integer.parseInt(strArr[1]),Integer.parseInt(strArr[2]));
       ob.printDistributionOfParticles();

    }
}
