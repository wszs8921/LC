package test1;

import java.util.*;

/**
 * @author adwstart
 * @create 2022-05-31 12:30
 */
public class Test25
{
    public List<List<Integer>> levelOrder(TreeNode root) {
        LinkedList<TreeNode> queue = new LinkedList<>();
        if(root!=null)
            queue.add(root);
        ArrayList<List<Integer>> res = new ArrayList<>();
        int flag=0;
        while(!queue.isEmpty())
        {
            int size=queue.size();
            ArrayList<Integer> row = new ArrayList<>();
            for(int i=0;i<=size-1;i++)
            {
                TreeNode node = queue.remove();
                row.add(node.val);
                if(node.left!=null)
                    queue.add(node.left);
                if(node.right!=null)
                    queue.add(node.right);
            }
            if(flag%2==1)
                Collections.reverse(row);
            flag++;
            res.add(row);
        }
        return res;
    }
}
