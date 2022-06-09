package test1;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

/**
 * @author adwstart
 * @create 2022-05-26 13:44
 */
public class QuickSortTest
{
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
        int temp = new Random().nextInt(right - left+1)+left;
        swap(nums,temp,right);
        int pre=left-1;
        for(int i=left;i<=right-1;i++)
        {
            if(nums[i]<nums[right])
            {
                pre++;
                swap(nums,pre,i);
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
        int[] arr = {3, 9, 4, 1, 5, 16};
        quickSort(arr,0,5);
        System.out.println(Arrays.toString(arr));

    }
}
