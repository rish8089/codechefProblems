package bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChefAndTheRightTrianglesMain {

    public static void main(String args[]) throws IOException {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        ChefAndTheRightTriangles ob=new ChefAndTheRightTriangles(br);
        ob.processInput(Integer.parseInt(br.readLine()));
        System.out.println(ob.getNoOfRightAngledTriangles());
    }
}
