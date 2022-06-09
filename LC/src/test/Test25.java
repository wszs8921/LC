package test;

/**
 * @author adwstart
 * @create 2022-05-06 19:05
 */
public class Test25
{
    public int minCost(int[][] costs) {
        int[][] dp = new int[3][costs.length];
        dp[0][0]=costs[0][0];
        dp[1][0]=costs[0][1];
        dp[2][0]=costs[0][2];
        for (int i=1;i<=costs.length-1;i++)
        {
            for (int j=0;j<=2;j++)
            {
                dp[j][i]=Math.min(dp[(j+1)%3][i-1],dp[(j+2)%3][i-1])+costs[i][j];
            }
        }
        int min=Math.min(Math.min(dp[0][costs.length-1],dp[1][costs.length-1]),dp[2][costs.length-1]);
        return min;
    }
}
