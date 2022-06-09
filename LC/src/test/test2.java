package test;

import java.util.Arrays;

/**
 * @author shkstart
 * @create 2022-01-27 16:03
 */
public class test2
{
    public static void main(String[] args)
    {
        int[] arr=new int[]{1,2,3,4};
        Solution2 solution2 = new Solution2();
        solution2.rotate(arr,2);
        System.out.println(Arrays.toString(arr));
    }
}
class Solution2 {
    public void rotate(int[] nums, int k) {
        int[] arr=new int[nums.length];
        for(int i=0,j=nums.length-k;i<k;i++,j++)
            arr[i]=nums[j];
        for(int i=k,j=0;i<nums.length;i++,j++)
            arr[i]=nums[j];
        for(int i=0;i<nums.length;i++)
            nums[i]=arr[i];
    }
}