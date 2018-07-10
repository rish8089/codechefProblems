package bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoinFlipMain {

    public static void main(String args[]) throws IOException {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        int T,G;
        T=Integer.parseInt(br.readLine());
        CoinFlip cf=new CoinFlip(br);
        while(T>0)
        {
            G=Integer.parseInt(br.readLine());
            cf.processInput(G);
            cf.printCoinsWithCertainFaces();
            T--;
        }
    }
}
