package test;

import java.util.HashMap;

/**
 * @author adwstart
 * @create 2022-04-19 12:45
 */
public class Test13
{
    public int pathSum(TreeNode root, int targetSum) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        return dfs(root,targetSum,map,0);
    }
    public int dfs(TreeNode root,int sum,HashMap<Integer,Integer> map,int path)
    {
        path=path+root.val;
        int count = map.getOrDefault(path-sum,0);
        map.put(path,map.getOrDefault(path,0)+1);
        int left=dfs(root.left,sum,map,path);
        int right=dfs(root.right,sum,map,path);
        map.put(path,map.get(path)-1);
        return count+left+right;
    }
}
