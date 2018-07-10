package bruteforce;
import java.io.BufferedReader;
import java.io.IOException;
class Node
{
    int I;
    int N;
    int Q;
}
class CoinFlip {
  BufferedReader br;
  Node A[];
  int G;
  int lim=20005;
    CoinFlip(BufferedReader br)
    {
        this.br=br;
        A=new Node[lim];
    }
    public void processInput(int G) throws IOException {
        this.G=G;
        for(int i=1;i<=G;i++)
        {
            String inq=br.readLine();
            String inqArr[]=inq.split(" ");
            A[i]=new Node();
            A[i].I=Integer.parseInt(inqArr[0]);
            A[i].N=Integer.parseInt(inqArr[1]);
            A[i].Q=Integer.parseInt(inqArr[2]);
        }
    }
    public void printCoinsWithCertainFaces()
    {
        for(int i=1;i<=G;i++)
        {

            if(A[i].I==1) //head in the start
            {
              if(A[i].Q==1)
              {
                System.out.println(A[i].N/2);
              }
              else
              {
                  System.out.println(A[i].N-A[i].N/2);
              }
            }
            else //tail in the start
            {
                if(A[i].Q==1)
                {
                  System.out.println(A[i].N-A[i].N/2);
                }
                else
                {
                    System.out.println(A[i].N/2);
                }
            }
        }
    }
}
