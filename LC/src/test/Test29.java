package test;

import org.junit.Test;

import java.util.HashMap;

/**
 * @author adwstart
 * @create 2022-05-11 17:58
 */
public class Test29
{
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] dp = new int[text1.length()+1][text2.length()+1];
        for(int i=1;i<=text1.length();i++)
        {
            for(int j=1;j<=text2.length();j++)
            {
                if(text1.charAt(i-1)==text2.charAt(j-1))
                    dp[i][j]=dp[i-1][j-1]+1;
                else
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        return dp[text1.length()][text2.length()];
    }
    @Test
    public void test()
    {
        System.out.println(longestCommonSubsequence("abcde","ace"));
        HashMap<Integer, Double> map = new HashMap<>();
        map.put(1,3.67);
        System.out.println(map.get(1));
    }
}
