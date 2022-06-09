package test1;

/**
 * @author adwstart
 * @create 2022-05-23 10:57
 */
public class Test14
{
    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE;
        int max=0;
        for(int i=0;i<=prices.length-1;i++)
        {
            min=Math.min(min,prices[i]);
            max=Math.max(max,prices[i]-min);
        }
        return max;
    }
}
