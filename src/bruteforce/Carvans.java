package bruteforce;

import java.io.BufferedReader;
import java.io.IOException;

class Carvans {

    BufferedReader br;
    int N,A[],lim=10005;
    Carvans(BufferedReader br)
    {
        this.br=br;
        A=new int[lim];
    }

    public void processInput(int N) throws IOException {
      this.N=N;
      String str=br.readLine();
      String strArr[]=str.split(" ");
      for(int i=0;i<strArr.length;i++)
      {
            A[i]=Integer.parseInt(strArr[i]);
      }
    }

    public int getCarsWithMaximumSpeed()
    {
        int max=A[0];
        int cnt=1;
        for(int i=1;i<N;i++)
        {
          if(A[i]<=max)
          {
              max=A[i];
              cnt+=1;
          }
        }
        return cnt;
    }


}
