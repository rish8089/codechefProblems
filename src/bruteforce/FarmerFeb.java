package bruteforce;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;

class FarmerFeb {

    int sieve[],A[],a,b;
    BufferedReader br;
    int lim=3000;
    List<Integer> primes=new ArrayList<Integer>();
    FarmerFeb(BufferedReader br)
    {
        this.br=br;
        sieve=new int[lim+1];
        precompute();
    }
    public void processInput(int a,int b)
    {
        this.a=a;
        this.b=b;

    }
    void precompute()
    {
       for(int i=2;i*i<=lim;i++)
       {
             if(sieve[i]==0) {
                 for (int j = i * i; j <= lim; j += i) {
                     sieve[j]=1;
                 }
             }
       }

       for(int i=2;i<=lim;i++)
       {
           if(sieve[i]==0)
               primes.add(i);
       }


    }

    public int getThirdPotatoVal()
    {
        return getJustGreaterPrime(a+b)-(a+b);
    }

    int getJustGreaterPrime(int val)
    {
        int u=0;
        int v=primes.size()-1;
        int ans=-1;
        while(u<=v)
        {
            int mid=(u+v)/2;
            if(primes.get(mid)<=val)
                u=mid+1;

            else
            {
                ans=primes.get(mid);
                v=mid-1;
            }

        }
        return ans;
    }


}
