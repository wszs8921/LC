package test;

/**
 * @author shkstart
 * @create 2022-04-01 13:16
 */
public class test5
{
    public static void main(String[] args)
    {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        node1.left=node2;
        node1.right=node3;
        System.out.println(node1.val+""+node1.left.val);
        del(node1);
        System.out.println(node1.val+""+node1.left.val);
    }
    public static void del(TreeNode root)
    {
        root.left=null;
    }
}


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
