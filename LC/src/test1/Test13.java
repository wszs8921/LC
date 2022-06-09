package test1;

/**
 * @author adwstart
 * @create 2022-05-18 12:31
 */
public class Test13
{
    public int minPathSum(int[][] grid) {
        int rows=grid.length;
        int cols=grid[0].length;
        int[][] dp = new int[rows][cols];
        int sum=0;
        for(int i=0;i<=rows-1;i++)
        {
            sum=sum+grid[i][0];
            dp[i][0]=sum;
        }
        sum=0;
        for(int i=0;i<=cols-1;i++)
        {
            sum=sum+grid[0][i];
            dp[0][i]=sum;
        }
        for(int i=1;i<=rows-1;i++)
            for (int j=1;j<=cols-1;j++)
            {
                dp[i][j]=Math.min(dp[i-1][j],dp[i][j-1])+grid[i][j];
            }
        return dp[rows-1][cols-1];
    }
}
