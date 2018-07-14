package bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LittleElephantAndPermutationsMain {

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int T=Integer.parseInt(br.readLine());
        int N;
        LittleElephantAndPermutations ob=new LittleElephantAndPermutations(br);
        while(T>0)
        {
            N=Integer.parseInt(br.readLine());
            ob.processInput(N);
            ob.IsPermuationGood();
            T--;
        }
    }

}
