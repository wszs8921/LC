package test1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author adwstart
 * @create 2022-06-06 14:07
 */
public class TreePathSum
{
    private List<Integer> path=new ArrayList<>();
    private List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int target) {
        dfs(root,target);
        return res;
    }
    public void dfs(TreeNode root,int target)
    {
        if(root==null)
            return;
        if(root.left!=null||root.right!=null)
        {
            int val=root.val;
            path.add(val);
            dfs(root.left,target-val);
            path.remove(path.size()-1);

            path.add(val);
            dfs(root.right,target-val);
            path.remove(path.size()-1);
        }
        else if(root.left==null&&root.right==null)
        {
            int val=root.val;
            path.add(val);
            target=target-val;
            if(target==0)
                res.add(new ArrayList<Integer>(path));
            path.remove(path.size()-1);
        }
    }
}
