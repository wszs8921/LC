package test1;

import org.junit.Test;

/**
 * @author adwstart
 * @create 2022-06-03 20:51
 */
public class Test26
{
    public boolean verifyPostorder(int[] postorder) {
        return verifySub(postorder,0,postorder.length-1);
    }
    public boolean verifySub(int[] postOrder,int left,int right)
    {
        if(left>right)
            return true;
        int index=right;
        for(int i=left;i<=right-1;i++)
        {
            if(postOrder[i]>postOrder[right])
            {
                index=i;
                break;
            }
        }
        boolean res1=true;
        for(int i=index;i<=right-1;i++)
        {
            if(postOrder[i]<postOrder[right])
                res1=false;
        }
        boolean res2 = verifySub(postOrder, left, index - 1);
        boolean res3 = verifySub(postOrder,index,right-1);
        return res1&&res2&&res3;
    }
    @Test
    public void test()
    {
        System.out.printf("", verifyPostorder(new int[]{4, 8, 6, 12, 16, 10}));
    }
}
