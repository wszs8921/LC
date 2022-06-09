package test;

import java.util.Arrays;

/**
 * @author shkstart
 * @create 2022-01-26 20:13
 */
public class test1
{
    public static void main(String[] args)
    {
        int[] arr1=new int[]{-5,-3,-2,-1,0};
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.sortedSquares(arr1)));
    }
}
class Solution {
    public int[] sortedSquares(int[] nums) {
        int index=-1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<0)
                index++;
            else
                break;
        }
        int left=index,right=index+1;
        int k=0;
        int[] arr=new int[nums.length];
//        if(left<0)
//        {
//            for(int i=0;i<nums.length;i++)
//                nums[i]=nums[i]*nums[i];
//            return nums;
//        }
//        if(right>nums.length-1)
//        {
//            for (int i=0,j=nums.length-1;i<nums.length;i++,j--)
//                arr[i]=nums[j]*nums[j];
//            return arr;
//        }
        while(left>=0&&right<=nums.length-1)
        {
            if(Math.pow(nums[left],2)<Math.pow(nums[right],2))
            {
                arr[k]=(int)Math.pow(nums[left],2);
                left--;
            }
            else
            {
                arr[k]=(int)Math.pow(nums[right],2);
                right++;
            }
            k++;
        }
        if(left<0)
            for(int i=0;k<nums.length;k++,i++)
                arr[k]=(int)Math.pow(nums[right+i],2);
        if(right>nums.length-1)
            for(int i=0;k<nums.length;k++,i++)
                arr[k]=(int)Math.pow(nums[left-i],2);
        return arr;
    }
}