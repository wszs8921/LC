package test1;

/**
 * @author adwstart
 * @create 2022-05-23 11:40
 */
public class Test15
{
    public int maxProfit(int[] prices) {
        int profit=0;
        for(int i=1;i<=prices.length-1;i++)
        {
            if(prices[i]>prices[i-1])
                profit=profit+prices[i]-prices[i-1];
        }
        return profit;
    }
}
