package bruteforce;
//this is my second comment
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CleaningUpMain {

    public static void main(String args[]) throws IOException
    {
        int T,N;
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        T=Integer.parseInt(br.readLine());
        CleaningUp ob=new CleaningUp(br);
        while(T>0)
        {
            String nk=br.readLine();
            String nkArr[]=nk.split(" ");
            ob.processInput(Integer.parseInt(nkArr[0]),Integer.parseInt(nkArr[1]));
            ob.displayChefAndHisAssistantJobs();
            T--;

        }

        }
}
