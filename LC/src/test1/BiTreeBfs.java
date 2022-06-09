package test1;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author adwstart
 * @create 2022-05-26 22:50
 */
public class BiTreeBfs
{
    public void bfs(TreeNode root, List<TreeNode> res)
    {
        Queue<TreeNode> queue = new LinkedList<>();
        if(root!=null)
            queue.add(root);
        while(!queue.isEmpty())
        {
            TreeNode cur = queue.remove();
            res.add(cur);
            if(cur.left!=null)
                queue.add(cur.left);
            if(cur.right!=null)
                queue.add(cur.right);
        }
    }
}
