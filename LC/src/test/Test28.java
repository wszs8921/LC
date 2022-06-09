package test;

import org.junit.Test;

import java.util.HashMap;

/**
 * @author adwstart
 * @create 2022-05-11 14:56
 */
public class Test28
{
    public int lenLongestFibSubseq(int[] arr) {
        int[][] dp = new int[arr.length][arr.length];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<=arr.length-1;i++)
            map.put(arr[i],i);
        for(int j=1;j<=arr.length-1;j++)
        {
            for(int i=0;i<=j-1;i++)
            {
                int pre = arr[j] - arr[i];
                int index=-1;
//                for(int k=0;k<=arr.length-1;k++)
//                {
//                    if(pre==arr[k]&&k<i)
//                    {
//                        index=k;
//                        break;
//                    }
//                }
                if(map.containsKey(pre)&&map.get(pre)<i)
                    index=map.get(pre);
                if(index<0)
                    dp[i][j]=2;
                else
                    dp[i][j]=dp[index][i]+1;
            }
        }
        int min=2;
        for(int i=0;i<=arr.length-1;i++)
            for(int j=0;j<=arr.length-1;j++)
                if(dp[i][j]>min)
                {
                    min=dp[i][j];
                    break;
                }
        return min;
    }
    @Test
    public void test()
    {
        System.out.println(lenLongestFibSubseq(new int[]{1,2,3,4,5,6,7,8}));
    }

}
