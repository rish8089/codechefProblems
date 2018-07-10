package bruteforce;

import java.io.BufferedReader;
import java.io.IOException;

class Payingup {

    BufferedReader br;
    int n,m;
    int lim=20;
    int A[];
    Payingup(BufferedReader br)
    {
       this.br=br;
       A=new int[lim];
    }

    public void processInput(int n,int m) throws IOException {
        this.m=m;
        this.n=n;



        for(int i=0;i<n;i++)
            A[i]=Integer.parseInt(br.readLine());






    }

    public void willRobberyBePossible()
    {
        int limit=(1<<n),sum,j,idx;
        for(int i=1;i<limit;i++)
        {
           j=i;
           idx=0;
           sum=0;
           while(j>0)
           {
               if(j%2==1)
                   sum+=A[idx];
               idx++;
               j=j/2;
           }

            if(sum==m) {
                System.out.println("Yes");
                return;
            }
        }

        System.out.println("No");

    }







}
