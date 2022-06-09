package test;

import org.junit.Test;

import java.util.HashMap;

/**
 * @author shkstart
 * @create 2022-03-21 13:28
 */
public class test4
{
    public String minWindow(String s, String t) {
        HashMap<Character,Integer> charToCount=new HashMap<>();
        int minLen=s.length()+1;
        String minStr="";
        for(int i=0;i<=t.length()-1;i++)
            charToCount.put(t.charAt(i),charToCount.getOrDefault(t.charAt(i),0)+1);
        for(int i=0,j=0;j<=s.length()-1;j++)
        {
            if(charToCount.containsKey(s.charAt(j)))
                charToCount.put(s.charAt(j),charToCount.get(s.charAt(j))-1);
            while(isAllZero(charToCount)&&i<=j)
            {
                if(j-i+1<minLen)
                {
                    minLen=j-i+1;
                    minStr=s.substring(i,j+1);
                }
                if(charToCount.containsKey(s.charAt(i)))
                    charToCount.put(s.charAt(i),charToCount.get(s.charAt(i))+1);
                i++;
            }
        }
        return minStr;
    }

    public boolean isAllZero(HashMap<Character,Integer> map)
    {
        for(char c:map.keySet())
        {
            if(map.get(c)!=0)
                return false;
        }
        return true;
    }
    @Test
    public void test1()
    {
        String str = minWindow("ADOBECODEBANC","ABC");
        System.out.println(str);
    }
}
