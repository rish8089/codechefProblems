package bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RacingHorsesMain {

    public static void main(String args[]) throws IOException
    {
        int T,N;
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        T=Integer.parseInt(br.readLine());
        RacingHorses ob=new RacingHorses(br);
        while(T>0)
        {
            N=Integer.parseInt(br.readLine());

            ob.processInput(N);
            System.out.println(ob.getMinDiff());
            T--;

        }
    }
}
