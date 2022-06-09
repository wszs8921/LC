package test1;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author adwstart
 * @create 2022-05-26 22:55
 */
public class Test18
{
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        TreeNode left=null;
        while (!queue.isEmpty())
        {
            int size=queue.size();
            left=queue.element();
            for(int i=1;i<=size;i++)
            {
                TreeNode cur = queue.remove();
                if(cur.left!=null)
                    queue.add(cur.left);
                if(cur.right!=null)
                    queue.add(cur.right);
            }
        }
        return left.val;
    }
}
