package test1;

import java.util.HashMap;
import java.util.Map;

/**
 * @author adwstart
 * @create 2022-05-28 15:33
 */
public class ReBuildBitree
{
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer, Integer> valToIndex = new HashMap<>();
        for(int i=0;i<=inorder.length-1;i++)
            valToIndex.put(inorder[i],i);
        TreeNode res = buildSub(preorder, inorder, 0, preorder.length - 1,
                0, inorder.length - 1, valToIndex);
        return res;

    }
    public TreeNode buildSub(int[] pre, int[] in, int preLeft, int preRight, int inLeft, int inRight,
                             Map<Integer,Integer> valToIndex)
    {
        if(preLeft>preRight)
            return null;
        int rootPreIndex=preLeft;
        int rootInIndex=valToIndex.get(pre[rootPreIndex]);
        int leftSize=rootInIndex-inLeft;
        int rightSize=inRight-rootInIndex;
        TreeNode root = new TreeNode(pre[rootPreIndex]);
        TreeNode left = buildSub(pre, in, preLeft + 1, preLeft + leftSize,
                inLeft, rootInIndex - 1, valToIndex);
        TreeNode right = buildSub(pre, in, preRight - rightSize + 1, preRight,
                rootInIndex + 1, inRight, valToIndex);
        root.left=left;
        root.right=right;
        return root;
    }
}
