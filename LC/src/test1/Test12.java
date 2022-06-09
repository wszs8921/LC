package test1;

import jdk.nashorn.internal.ir.ReturnNode;
import org.junit.Test;

import java.math.BigInteger;

/**
 * @author adwstart
 * @create 2022-05-18 11:28
 */
public class Test12
{
    public int uniquePaths(int m, int n)
    {
        int[][] dp = new int[m][n];
        for (int i = 0; i <= m - 1; i++)
            dp[i][0] = 1;
        for (int i = 0; i <= n - 1; i++)
            dp[0][i] = 1;
        for (int i = 1; i <= m - 1; i++)
            for (int j = 1; j <= n - 1; j++)
            {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        return dp[m - 1][n - 1];
    }
    @Test
    public void test()
    {
        System.out.println(uniquePaths(10,10));
    }
}
