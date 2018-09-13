package bruteforce;

import java.io.BufferedReader;
import java.io.IOException;

class GCD2 {

    BufferedReader br;

    int A;
    int B[],N,C;
    int lim=251;
    GCD2(BufferedReader br)
    {
        this.br=br;
        B=new int[lim];
        C=-1;
    }
    public void processInput() throws IOException {
        String str=br.readLine();
        String strArr[]=str.split(" ");
        A=Integer.parseInt(strArr[0]);
        for(int i=0;i<strArr[1].length();i++)
          B[i]=strArr[1].charAt(i)-48;

        N=strArr[1].length();

        if(N<=5)
            C=Integer.parseInt(strArr[1]);


    }


    public int calculateMod(int B[],int A)
    {
        int temp=0;
        for(int i=0;i<N;i++)
        {
            temp=temp*10+B[i];
            if(temp>A)
                temp=temp%A;
        }
        return temp;
    }

    public void getGCD()
    {
         if(C!=-1)
             System.out.println(calculateGCD(A,C));
         else
         {
             if(A==0)
             {
                 for(int i=0;i<N;i++)
                     System.out.print(B[i]);
                 System.out.println();
             }
             else
                 System.out.println(calculateGCD(A,calculateMod(B,A)));
         }
    }

    public int calculateGCD(int a,int b)
    {
        if(b==0)
            return a;
        else
            return calculateGCD(b,a%b);
    }


}
