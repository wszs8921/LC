package test;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * @author adwstart
 * @create 2022-04-30 20:29
 */
public class Test19
{
    public List<List<Integer>> permuteUnique(int[] nums) {
        ArrayList<List<Integer>> res = new ArrayList<>();
        dfs(0,nums,res);

        HashSet<List<Integer>> set = new HashSet<>(res);
        res.clear();
        res.addAll(set);
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
    @Test
    public void test()
    {
        int[] arr = new int[]{1,1,2};
        List<List<Integer>> lists = permuteUnique(arr);
        System.out.println(lists);
    }
}
