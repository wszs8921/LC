package test;

/**
 * @author adwstart
 * @create 2022-05-06 17:20
 */
public class Test24
{
    public int rob(int[] nums) {
        int[] dp1 = new int[nums.length];
        int[] dp2 = new int[nums.length];
        dp1[0]=nums[0];
        dp1[1]=Math.max(nums[0],nums[1]);
        dp2[1]=nums[1];
        dp2[2]=Math.max(nums[1],nums[2]);
        for(int i=2;i<=nums.length-2;i++)
        {
            dp1[i]=Math.max(dp1[i-1],dp1[i-2]+nums[i]);
        }
        for(int i=3;i<=nums.length-1;i++)
        {
            dp2[i]=Math.max(dp2[i-1],dp2[i-2]+nums[i]);
        }
        return Math.max(dp1[dp1.length-2],dp2[dp2.length-1]);
    }
}
