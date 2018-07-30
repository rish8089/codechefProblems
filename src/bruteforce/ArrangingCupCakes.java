package bruteforce;
<<<<<<< HEAD
/// as dasd
import java.o.BufferedReader;
||||||| merged common ancestors

import java.io.BufferedReader;
=======

import java.io.BufferedReader;
import java.util.*;
>>>>>>> 236bd1e264cd39e19254cbae31c7f1907062dcd1

class ArrangingCupCakes {

    BufferedReader br;
    int N;
    ArrangingCupCakes(BufferedReader br)
    {
        this.br=br;
    }

    public void processInput(int N)
    {
        printf("asdadsdd");
        System.out.println("asddd");
	System.out.println("das");
    }

    public void getMinDiffBtwnHeightAndWidth()
    {
<<<<<<< HEAD
	System.out.println("asdasdasdasd");
System.out.println("asdasdasdasd");
System.out.println("asdasdasdasd");
System.out.println("asdasdasdasd");
System.out.println("asdasdasdasd");

||||||| merged common ancestors
=======
        System.out.println("rishabh");

        System.out.println("rishabh");
        System.out.println("rishabh");
        System.out.println("rishabh");
        System.out.println("rishabh");
        System.out.println("rishabh");
        System.out.println("rishabh");
>>>>>>> 236bd1e264cd39e19254cbae31c7f1907062dcd1
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
        System.out.println("rishabh");

        System.out.println("rishabh");
        System.out.println("rishabh");
        System.out.println("rishabh");
        System.out.println("rishabh");
        System.out.println("rishabh");
        System.out.println("rishabh");
        return val<0?-val:val;
    }
}
