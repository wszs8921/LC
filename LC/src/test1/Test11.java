package test1;

import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

/**
 * @author adwstart
 * @create 2022-05-17 12:19
 */
public class Test11
{
    public int findKthLargest(int[] nums, int k) {
        quickSort(nums,0,nums.length-1);
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
        int rand= new Random().nextInt(right-left+1)+left;
        swap(nums,rand,right);
        int cur=left-1;
        for(int i=left;i<=right;i++)
        {
            if(nums[i]<nums[right])
            {
                cur++;
                swap(nums,cur,i);
            }
        }
        cur++;
        swap(nums,cur,right);
        return cur;
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
        int[] arr = {3, 9, 4, 5, 1, 8, 5, 3};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}



























