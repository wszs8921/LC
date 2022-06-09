package test1;

import org.junit.Test;

import java.util.Arrays;
import java.util.Queue;
import java.util.Random;

/**
 * @author adwstart
 * @create 2022-05-15 18:15
 */
public class Test8
{
    public int findKthLargest(int[] nums, int k) {
        quickSort(nums,0,nums.length-1);
//        System.out.println(Arrays.toString(nums));
        return nums[nums.length-k];
    }
    public void quickSort(int[] nums,int left,int right)
    {
        if(left<right)
        {
            int pivot=partition(nums,left,right);
            quickSort(nums,left,pivot-1);
            quickSort(nums,pivot+1,right);
        }
    }
    public int partition(int[] nums,int left,int right)
    {
        int rand = new Random().nextInt(right - left + 1) + left;
        swap(nums,rand,right);
        int pre=left-1;
        for(int i=left;i<=right-1;i++)
        {
            if(nums[i]<nums[right])
            {
                pre++;
                swap(nums,i,pre);
            }
        }
        pre++;
        swap(nums,pre,right);
        return pre;
    }

    public void swap(int[] nums,int i,int j)
    {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    @Test
    public void test()
    {
        findKthLargest(new int[]{5,6,1,8,3,9},3);
    }
}
















