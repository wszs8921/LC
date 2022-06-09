package test1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author adwstart
 * @create 2022-05-26 22:26
 */
public class Test17
{
    public List<Integer> largestValues(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        ArrayList<Integer> res = new ArrayList<>();
        while (!queue.isEmpty())
        {
            int size=queue.size();
            int max=Integer.MIN_VALUE/2;
            for(int i=1;i<=size;i++)
            {
                TreeNode cur = queue.remove();
                max=Math.max(max,cur.val);
                if(cur.left!=null)
                    queue.add(cur.left);
                if(cur.right!=null)
                    queue.add(cur.right);
            }
            res.add(max);
        }
        return res;
    }
}
