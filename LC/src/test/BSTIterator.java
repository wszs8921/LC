package test;

import java.util.Stack;

/**
 * @author adwstart
 * @create 2022-04-28 12:16
 */
public class BSTIterator
{
    private TreeNode cur;
    private Stack<TreeNode> stack;
    public BSTIterator(TreeNode root) {
        cur=root;
        stack = new Stack<>();
    }

    public int next() {
        while (cur!=null)
        {
            stack.push(cur);
            cur=cur.left;
        }
        cur = stack.pop();
        int val=cur.val;
        cur=cur.right;
        return val;
    }

    public boolean hasNext() {
        return cur!=null||!stack.isEmpty();
    }
}
