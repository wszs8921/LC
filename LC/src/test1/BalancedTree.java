package test1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author adwstart
 * @create 2022-05-26 18:25
 */
public class BalancedTree
{
    public boolean isBalanced(TreeNode root) {
//        return dfsBalanced(root);
        ArrayList<TreeNode> nodes = new ArrayList<>();
        dfs(root,nodes);
        for(int i=0;i<=nodes.size()-1;i++)
        {
            if(Math.abs(dfsDept(nodes.get(i).left)-dfsDept(nodes.get(i).right))>1)
                return false;
        }
        return true;
    }
    public int dfsDept(TreeNode root)
    {
        if(root==null)
            return 0;
        int ld=dfsDept(root.left);
        int rd=dfsDept(root.right);
        return Math.max(ld,rd)+1;
    }
    public boolean dfsBalanced(TreeNode root)
    {
        if(root==null)
            return true;
        boolean lres=dfsBalanced(root.left);
        boolean rres=dfsBalanced(root.right);
        boolean res=Math.abs(dfsDept(root.left)-dfsDept(root.right))<=1;
        return lres&&rres&&res;
    }
    public void dfs(TreeNode root, List<TreeNode> nodes)
    {
        if(root==null)
            return;
        nodes.add(root);
        dfs(root.left,nodes);
        dfs(root.right,nodes);
    }
}
