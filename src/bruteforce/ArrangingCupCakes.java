package bruteforce;

import java.io.BufferedReader;

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
        System.out.println("rishabh");

        System.out.println("rishabh");
        System.out.println("rishabh");
        System.out.println("rishabh");
        System.out.println("rishabh");
        System.out.println("rishabh");
        System.out.println("rishabh");
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
