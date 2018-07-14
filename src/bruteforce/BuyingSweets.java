package bruteforce;

import java.io.BufferedReader;
import java.io.IOException;

class BuyingSweets {

    int N,K,A[],lim=105;
    BufferedReader br;
     BuyingSweets(BufferedReader br)
     {
         this.br=br;
         A=new int[lim];
     }

     public void processInput(int N,int K) throws IOException {
         this.N=N;
         this.K=K;

         String str=br.readLine();
         String strArr[]=str.split(" ");

         for(int i=0;i<N;i++)
             A[i]=Integer.parseInt(strArr[i]);

     }

     public int getNoOfSweets()
     {
         int sum=0;
         for(int i=0;i<N;i++)
             sum+=A[i];

         int sweets=sum/K;

         int extra_amount=sum%K;

         boolean adequate=false;

         for(int i=0;i<N;i++)
         {
             if(A[i]<=extra_amount)
                 adequate=true;
         }

         if(adequate)
             return -1;
         else
             return sweets;


     }


}
