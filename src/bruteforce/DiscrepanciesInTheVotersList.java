package bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class DiscrepanciesInTheVotersList {

    int N1,N2,N3;
    int A[],B[],C[];
    BufferedReader br;
    int lim=50005;

    DiscrepanciesInTheVotersList(BufferedReader br)
    {
        this.br=br;
        A=new int[lim];
        B=new int[lim];
        C=new int[lim];
    }


    public void processInput(int N1,int N2, int N3 ) throws IOException {
        this.N1=N1;
        this.N2=N2;
        this.N3=N3;

        for(int i=1;i<=N1;i++)
            A[i]=Integer.parseInt(br.readLine());
        for(int i=1;i<=N2;i++)
            B[i]=Integer.parseInt(br.readLine());
        for(int i=1;i<=N3;i++)
            C[i]=Integer.parseInt(br.readLine());
    }

    public void printFinalList()
    {
        int i=1,j=1,k=1;

        List<Integer> list=new ArrayList<Integer>();

        while(i<=N1 && j<=N2 && k<=N3)
        {
            if(A[i]==B[j] && B[j]==C[k])
            {
                list.add(A[i]);
                i++;
                j++;
                k++;
            }
            else if(A[i]==B[j])
            {
                if(C[k]<A[i])
                 k++;
                else
                {
                    list.add(A[i]);
                    i++;
                    j++;
                }
            }
            else if(B[j]==C[k])
            {
                if(A[i]<B[j])
                    i++;
                else
                {
                    list.add(B[j]);
                    j++;
                    k++;
                }
            }

            else if(C[k]==A[i])
            {
                if(B[j]<C[k])
                    j++;
                else
                {
                    list.add(C[k]);
                    k++;
                    i++;
                }
            }

            else
            {
                if(A[i]<B[j] && A[i]<C[k])
                    i++;
                else if(B[j]<A[i] && B[j]<C[k])
                    j++;
                else
                    k++;
            }

        }

        while(i<=N1 && j<=N2)
        {
            if(A[i]==B[j])
            {
                list.add(A[i]);
                i++;
                j++;
            }
            else if(A[i]<B[j])
                i++;
            else
                j++;
        }

        while(i<=N1 && k<=N3)
        {
            if(A[i]==C[k])
            {
                list.add(A[i]);
                i++;
                k++;
            }
            else if(A[i]<C[k])
                i++;
            else
                k++;
        }

        while(j<=N2 && k<=N3)
        {
            if(B[j]==C[k])
            {
                list.add(B[j]);
                j++;
                k++;
            }
            else if(B[j]<C[k])
                j++;
            else
                k++;
        }

        System.out.println(list.size());
        for(Integer e:list)
            System.out.println(e);

    }
}
