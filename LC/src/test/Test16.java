package test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author adwstart
 * @create 2022-04-30 12:13
 */
public class Test16
{
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        ArrayList<Integer> subset = new ArrayList<>();
        ArrayList<List<Integer>> res = new ArrayList<>();
        dfs(0,target,candidates,subset,res);

        return res;
    }
    public void dfs(int cur,int target,int[] nums,List<Integer> subset,List<List<Integer>> res)
    {
        if(cur<=nums.length-1&&target>0)
        {
            subset.add(nums[cur]);
            dfs(cur,target-nums[cur],nums,subset,res);
            subset.remove(subset.size()-1);

            dfs(cur+1,target,nums,subset,res);
        }
        else if(target==0)
            res.add(new ArrayList<Integer>(subset));
    }
}
