package test1;

import com.sun.xml.internal.bind.v2.model.core.ID;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;


/**
 * @author adwstart
 * @create 2022-06-07 11:43
 */
public class CombinationSum
{
    private ArrayList<ArrayList<Integer>> res=new ArrayList<>();
    private ArrayList<Integer> comb=new ArrayList<>();
    public ArrayList<ArrayList<Integer>> combinationSum2(int[] num, int target) {
        Arrays.sort(num);
        dfs(num,0,target);
        LinkedHashSet<ArrayList<Integer>> set = new LinkedHashSet<>(res);
        res.clear();
        res.addAll(set);
//        HashSet<ArrayList<Integer>> set = new HashSet<>(res);
//        res.clear();
//        res.addAll(set);
        return res;
    }
    public void dfs(int[] num,int index,int target)
    {
        if(index<=num.length-1&&target>0)
        {
            comb.add(num[index]);
            dfs(num,index+1,target-num[index]);
            comb.remove(comb.size()-1);

            dfs(num,index+1,target);
        }
        else if(target==0)
        {
            res.add(new ArrayList<Integer>(comb));
        }
    }
    @Test
    public void test()
    {
        int[] nums = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,};
        ArrayList<ArrayList<Integer>> res = combinationSum2(nums, 20);
        System.out.println(res);
    }
}
