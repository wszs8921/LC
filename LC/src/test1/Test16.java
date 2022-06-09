package test1;

/**
 * @author adwstart
 * @create 2022-05-23 13:28
 */
public class Test16
{
    public int maxProfit(int[] prices) {
        //0-5表示未买入，第一次买入，第一次卖出，第二次买入，第二次卖出
        int[][] dp = new int[prices.length][5];
        dp[0][0]=0;
        dp[0][1]=-prices[0];
        dp[0][2]=0;
        dp[0][3]=-prices[0];
        dp[0][4]=0;
        for(int i=1;i<=prices.length-1;i++)
        {
            dp[i][0]=0;
            dp[i][1]=Math.max(dp[i-1][1],-prices[i]);
            dp[i][2]=Math.max(dp[i-1][2],dp[i-1][1]+prices[i]);
            dp[i][3]=Math.max(dp[i-1][3],dp[i-1][2]-prices[i]);
            dp[i][4]=Math.max(dp[i-1][4],dp[i-1][3]+prices[i]);
        }
        return Math.max(dp[prices.length-1][2],dp[prices.length-1][4]);
    }
}
