package bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BuyingSweetsMain {

    public  static void main(String args[]) throws IOException {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        int T=Integer.parseInt(br.readLine());
        BuyingSweets ob=new BuyingSweets(br);
        while(T>0)
        {
            String nk=br.readLine();
            String nkArr[]=nk.split(" ");
            ob.processInput(Integer.parseInt(nkArr[0]),Integer.parseInt(nkArr[1]));
            System.out.println(ob.getNoOfSweets());
            T--;
        }
    }
}
