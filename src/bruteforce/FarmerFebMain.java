package bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FarmerFebMain {
    public static void main(String args[]) throws IOException {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        FarmerFeb ob=new FarmerFeb(br);
        int T=Integer.parseInt(br.readLine());
        while(T>0)
        {
            String ab=br.readLine();
            String abArr[]=ab.split(" ");
            ob.processInput(Integer.parseInt(abArr[0]),Integer.parseInt(abArr[1]));
            System.out.println(ob.getThirdPotatoVal());
            T--;

        }



    }
}
