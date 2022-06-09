package test;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * @author adwstart
 * @create 2022-04-30 13:08
 */
public class Test17
{
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        ArrayList<Integer> subset = new ArrayList<>();
        ArrayList<List<Integer>> res = new ArrayList<>();
        dfs(0,target,candidates,subset,res);

        HashSet<List<Integer>> set = new HashSet<>(res);
        res.clear();
        res.addAll(set);
        return res;
    }
    public void dfs(int cur,int target,int[] nums,List<Integer> subset,List<List<Integer>> res)
    {
        if(cur<=nums.length-1&&target>0)
        {
            subset.add(nums[cur]);
            dfs(cur+1,target-nums[cur],nums,subset,res);
            subset.remove(subset.size()-1);

            dfs(cur+1,target,nums,subset,res);
        }
        else if(target==0)
            res.add(new ArrayList<Integer>(subset));
    }
    @Test
    public void test()
    {
        int[] arr = new int[]{2,5,2,1,2};
        List<List<Integer>> lists = combinationSum2(arr, 5);
        System.out.println(lists);
    }
}
