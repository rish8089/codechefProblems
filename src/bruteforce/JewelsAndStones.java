package bruteforce;

import java.io.BufferedReader;

class JewelsAndStones {

    BufferedReader br;
    String jewels;
    String stones;
    JewelsAndStones(BufferedReader br)
    {
        this.br=br;
    }

    public void processInput(String jewels,String stones)
    {
        this.jewels=jewels;
        this.stones=stones;
    }
    public int calculateNoOfJewels()
    {
        int hash[]=new int[52];
        for(int i=0;i<jewels.length();i++)
        {
            char ch=jewels.charAt(i);
            if(ch>='A' && ch<='Z')
                hash[26+ch-'A']++;
            else
                hash[ch-'a']++;
        }
        int cnt=0;
        for(int i=0;i<stones.length();i++)
        {
            char ch=stones.charAt(i);
            if(ch>='A' && ch<='Z')
            {
                if(hash[26+ch-'A']>0)
                    cnt+=1;
            }
            else
            {
                if(hash[ch-'a']>0)
                    cnt+=1;
            }
        }
        return cnt;
    }
}
