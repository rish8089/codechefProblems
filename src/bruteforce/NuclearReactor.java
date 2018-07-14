package bruteforce;

import java.io.BufferedReader;


public class NuclearReactor
{
    BufferedReader br;
    long A;
    int N,K;
    NuclearReactor(BufferedReader br)
    {
        this.br=br;
    }


    public void processInput(long A,int N,int K)
    {
        this.A=A;
        this.N=N;
        this.K=K;
    }

    public void printDistributionOfParticles()
    {
       long prod[]=new long[K+1];//product array of length K+1
       long distribution[]=new long[K+1];
       prod[0]=1;
       int i=1,idx=-1;
       while(A>0 && i<=K)
       {
         if(A<prod[i-1]*(N+1)) {
             prod[i] = prod[i - 1] * (N + 1);
             break;
         }
         else
         {
             prod[i]=prod[i-1]*(N+1);
             i=i+1;
         }
       }

       if(i>K)
           A=A%prod[i-1];

       i=1;

       while(A>0 && i<=K)
       {
           if(A<prod[i]) {
               idx = i;
               break;
           }
           else
               i++;
       }


       for(i=idx;i>=1 && A>0;i--)
       {
           distribution[i]=A/prod[i-1];
           A=A%prod[i-1];
       }

       for(i=1;i<=K;i++)
           System.out.print(distribution[i]+" ");
       System.out.println();


















    }



}
