package bruteforce;

import java.io.BufferedReader;
import java.io.IOException;

class CleaningUp {
   BufferedReader br;
   int A[];
   int N,K,lim=1005;
   CleaningUp(BufferedReader br)
   {
       this.br=br;
       A=new int[lim];
   }

   public void processInput(int N,int K) throws IOException {
       this.N=N;
       this.K=K;

       String str=br.readLine();
       String strArr[]=str.split(" ");
       for(int i=0;i<K;i++)
           A[i]=Integer.parseInt(strArr[i]);


   }

   public void displayChefAndHisAssistantJobs()
   {
       int hash[]=new int[1005];

       for(int i=0;i<K;i++)
           hash[A[i]]=1;



       //2 assigned for chef
       //3 assigned for assistant

       int cnt=0;
       for(int i=1;i<=N;i++)
       {
           if(hash[i]!=1)
           {
               if(cnt%2==0) {
                   hash[i] = 2;
                   cnt++;
               }
               else
               {
                   hash[i]=3;
                   cnt++;
               }

           }
       }

       //for(int i=1;i<=N;i++)
         //  System.out.println(A[i]+ " ");



       for(int i=1;i<=N;i++)
       {
           if(hash[i]==2)
               System.out.print(i+" ");
       }
       System.out.println();
       for(int i=1;i<=N;i++)
       {
           if(hash[i]==3)
               System.out.print(i+" ");
       }
       System.out.println();
   }

}
