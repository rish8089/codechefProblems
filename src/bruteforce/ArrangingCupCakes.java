package bruteforce;
import java.io.BufferedReader;
import java.util.*;

class ArrangingCupCakes {

    BufferedReader br;
    int N;
    ArrangingCupCakes(BufferedReader br)
    {
        this.br=br;
    }

    public void processInput(int N)
    {
        this.N=N;
    }

    public void getMinDiffBtwnHeightAndWidth()
    {
        int min=0;
        for(int i=1;i*i<=N;i++)
        {
           if(N%i==0)
           {
               if(min==-1)
                   min=abs(N/i-i);
               else if(min>abs(N/i-i))
                   min=abs(N/i-i);

           }
        }
        System.out.println(min);
    }
    private int abs(int val)
    {
        return val<0?-val:val;
    }
}
