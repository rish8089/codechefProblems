package bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DiscrepanciesInTheVotersListMain {
    public static void main(String args[]) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        DiscrepanciesInTheVotersList ob = new DiscrepanciesInTheVotersList(br);
        String str=br.readLine();
        String strArr[]=str.split(" ");
        ob.processInput(Integer.parseInt(strArr[0]),Integer.parseInt(strArr[1]),Integer.parseInt(strArr[2]));
        ob.printFinalList();
    }

}
