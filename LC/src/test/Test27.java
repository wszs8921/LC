package test;

import org.junit.Test;

/**
 * @author adwstart
 * @create 2022-05-11 12:22
 */
public class Test27
{
    public int minFlipsMonoIncr(String s)
    {
        int[][] dp = new int[2][s.length()];
        dp[0][0] = (s.charAt(0) == '0' ? 0 : 1);
        dp[1][0] = (s.charAt(0) == '1' ? 0 : 1);
        for (int i = 1; i <= s.length() - 1; i++)
        {
            dp[0][i] = dp[0][i - 1] + (s.charAt(i) =='0'? 0 : 1);
            dp[1][i]=Math.min(dp[0][i-1],dp[1][i-1])+(s.charAt(i) == '1' ? 0 : 1);
        }
        return Math.min(dp[0][s.length()-1],dp[1][s.length()-1]);
    }
    @Test
    public void test()
    {
        System.out.println(minFlipsMonoIncr("00110"));
    }
}
