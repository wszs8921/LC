package test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author adwstart
 * @create 2022-05-05 17:10
 */
public class Test20
{
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        dfs(0,0,n,"",res);
        return res;
    }
    public void dfs(int left,int right,int n,String curStr,List<String> res)
    {
        if(left<n||right<n)
        {
            if(left>right&&right!=n)
            {
                dfs(left,right+1,n,curStr+")",res);
            }
            if(left!=n)
            {
                dfs(left+1,right,n,curStr+"(",res);
            }
        }
        else
        {
            res.add(curStr);
        }
    }
}
