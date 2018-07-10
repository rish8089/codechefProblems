package bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;

public class RacingHorses {

    int A[];
    BufferedReader br;
    int N;
    int lim=5005;

    RacingHorses(BufferedReader br) {
        this.br = br;
        A=new int[lim];
    }

    public void processInput(int N) throws IOException {
        String s = br.readLine();
        String strArr[]=s.split(" ");
        this.N=N;
        for(int i=0;i<N;i++)
            A[i]=Integer.parseInt(strArr[i]);

    }

    public int getMinDiff()
    {
        Arrays.sort(A,0,N);

        int ans=-1;
        for(int i=0;i<N-1;i++)
        {
           if(ans==-1)
               ans=A[i+1]-A[i];
           else if(ans>A[i+1]-A[i])
               ans=A[i+1]-A[i];

        }
        return ans;
    }

}
