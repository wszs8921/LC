package test;

/**
 * @author adwstart
 * @create 2022-05-05 21:52
 */
public class test23
{
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length+1];
        dp[0]=0;
        dp[1]=0;
        for(int i=2;i<=dp.length-1;i++)
        {
            dp[i]=Math.min(dp[i-2]+cost[i-2],dp[i-1]+cost[i-1]);
        }
        return dp[dp.length-1];
    }
}
