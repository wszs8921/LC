package test;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author adwstart
 * @create 2022-04-28 17:15
 */
public class Test15
{
    public List<List<Integer>> subsets(int[] nums) {
        ArrayList<Integer> subset = new ArrayList<>();
        ArrayList<List<Integer>> res = new ArrayList<>();
        dfs(0,nums,subset,res);
        return res;
    }
    public void dfs(int cur,int[] nums,List<Integer> subset,List<List<Integer>> res)
    {
        if(cur<=nums.length-1)
        {
            subset.add(nums[cur]);
            dfs(cur+1,nums,subset,res);
            subset.remove(subset.size()-1);

            dfs(cur+1,nums,subset,res);
        }
        else
        {
            res.add(new ArrayList<Integer>(subset));
        }
    }
    @Test
    public void test()
    {
        List<List<Integer>> subsets = subsets(new int[]{1, 2, 3});
        System.out.println(subsets);
    }
}
