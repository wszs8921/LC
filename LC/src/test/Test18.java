package test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author adwstart
 * @create 2022-04-30 14:22
 */
public class Test18
{
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        dfs(0,nums,res);
        return res;
    }
    public void dfs(int cur,int[] nums,List<List<Integer>> res)
    {
        if(cur<=nums.length-1)
        {
            for(int i=cur;i<=nums.length-1;i++)
            {
                swap(nums,cur,i);
                dfs(cur+1,nums,res);
                swap(nums,cur,i);
            }
        }
        else
        {
            ArrayList<Integer> permutation = new ArrayList<>();
            for(int num:nums)
            {
                permutation.add(num);
            }
            res.add(permutation);
        }
    }
    public void swap(int[] nums,int i,int j)
    {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
