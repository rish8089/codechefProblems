package bruteforce;

import java.io.BufferedReader;
import java.io.IOException;

public class CielAB {

    BufferedReader br;
    int A,B;
    CielAB(BufferedReader br)
    {
      this.br=br;
    }
    public void processInput(int A,int B) {
       this.A=A;
       this.B=B;
    }
    public int getIncorrectDiff()
    {
        int diff=A-B;

        int x=diff%10;
        if(x==9)
            return (diff/10)*10+1;
        else
            return (diff/10)*10+(x+1);
    }
}
