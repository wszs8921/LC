package test1;




/**
 * @author adwstart
 * @create 2022-05-26 17:47
 */
public class TreeDept
{
    public int maxDepth(TreeNode root) {
        int[] dept = new int[1];
        dfs(root,dept);
        return dept[0];
    }
    public void dfs(TreeNode root,int[] dept)
    {
        if(root==null)
        {
            dept[0]=0;
            return;
        }
        int[] deptLeft = new int[1];
        int[] deptRight = new int[1];
        dfs(root.left,deptLeft);
        dfs(root.right,deptRight);
        dept[0]=Math.max(deptLeft[0],deptRight[0])+1;
    }
}

class TreeNode
{
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x)
    {
        val = x;
    }
}