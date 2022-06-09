package test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author adwstart
 * @create 2022-04-27 12:12
 */
public class Test14
{
    public TreeNode increasingBST(TreeNode root) {
        ArrayList<TreeNode> list = new ArrayList<>();
        dfs(root,list);
        list.add(null);
        for(int i=0;i<=list.size()-2;i++)
        {
            list.get(i).left=null;
            list.get(i).right=list.get(i+1);
        }
        return list.get(0);
    }

    public void dfs(TreeNode root,List<TreeNode> list)
    {
        if(root!=null)
        {
            dfs(root.left, list);
            list.add(root);
            dfs(root.right,list);
        }
    }
}



















