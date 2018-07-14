package bruteforce;

public class AVeryEasyProblem {

    public void printNumbers() {
        int A[] = {137, 1315, 73, 136, 255, 1384, 16385};
        StringBuffer res[] = new StringBuffer[A.length];

        for (int i = 0; i < A.length; i++) {
            res[i] = convert(A[i], 0);
        }

        for (int i = 0; i < A.length; i++)
            System.out.println(A[i] + "=" + res[i]);

    }


    public StringBuffer convert(int num, int cnt) {
         StringBuffer temp=new StringBuffer("");
         while(num>0)
         {
             if(num%2==1)
             {
                 if(temp.length()>0)
                     temp.insert(0,"+");

                 if(cnt==0 || cnt==2)
                     temp.insert(0,"2("+cnt+")");
                 else if(cnt==1)
                     temp.insert(0,2);
                 else
                     temp.insert(0,"2("+convert(cnt,0)+")");

             }
             num=num/2;
             cnt++;
         }

         return temp;

    }
}