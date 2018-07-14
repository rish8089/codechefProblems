package bruteforce;

import java.io.BufferedReader;
import java.io.IOException;

class LittleElephantAndPermutations {

    int A[];
    int lim=105,N;
    BufferedReader br;

    LittleElephantAndPermutations(BufferedReader br)
    {
        this.br=br;
        A=new int[lim];
    }

    public void processInput(int N) throws IOException {
        this.N=N;
        String str=br.readLine();
        String strArr[]=str.split(" ");
        for(int i=0;i<strArr.length;i++)
            A[i] = Integer.parseInt(strArr[i]);

    }

    public void IsPermuationGood()
    {
        int localInversions=0,inversions=0;
        for(int i=0;i<N-1;i++)
        {
            if(A[i]>A[i+1])
                localInversions+=1;
        }

        int B[]=new int[A.length];
        for(int i=0;i<A.length;i++)
            B[i]=A[i];


        inversions=mergeSort(B,0,N-1);

        if(localInversions==inversions)
            System.out.println("YES");
        else
            System.out.println("NO");

    }


    int mergeSort(int B[],int u,int v)
    {
      if(u>=v)
          return 0;
      int mid=(u+v)/2;

      int x=mergeSort(B,u,mid);
      int y=mergeSort(B,mid+1,v);
      return x+y+merge(B,u,mid,v);
    }
    int merge(int B[],int u,int mid,int v)
    {
        int temp[]=new int[v-u+1];

        int i=u,j=mid+1;

        int idx=0;
        int inversions=0;
        while(i<=mid && j<=v)
        {
            if(B[i]<=B[j])
                temp[idx++] = B[i++];

            else
            {
                temp[idx++]=B[j++];
                inversions+=mid-i+1;
            }

        }

        while(i<=mid)
            temp[idx++]=B[i++];

        while(j<=v)
            temp[idx++]=B[j++];

        idx=0;
        for(i=u;i<=v;i++)
            B[i]=temp[idx++];

        return inversions;
    }


}


