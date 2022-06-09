package test1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author adwstart
 * @create 2022-05-28 16:42
 */
public class Test20
{
    public boolean isSubStructure(TreeNode A, TreeNode B)
    {
        if(B==null)
            return false;
        return isSub(A,B);
    }
    public boolean isSub(TreeNode A,TreeNode B)
    {
        if(A==null)
            return false;
        boolean res1=isSubFromRoot(A,B);
        boolean res2=isSub(A.left,B);
        boolean res3=isSub(A.right,B);
        return res1||res2||res3;
    }
    public boolean isSubFromRoot(TreeNode A,TreeNode B)
    {
        if(B==null)
            return true;
        else if(A==null)
            return false;
        boolean res1=(A.val==B.val);
        boolean res2=isSubFromRoot(A.left,B.left);
        boolean res3=isSubFromRoot(A.right,B.right);
        return res1&&res2&&res3;
    }
}
