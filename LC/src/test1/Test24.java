package test1;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

/**
 * @author adwstart
 * @create 2022-05-31 12:03
 */
public class Test24
{
    public int[] reversePrint(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode cur=head;
        while (cur!=null)
        {
            stack.push(cur.val);
            cur=cur.next;
        }

        int[] arr = new int[stack.size()];
        int size=stack.size();
        for(int i=0;i<=size-1;i++)
            arr[i]=stack.pop();
        return arr;
    }
}
class ListNode
  {
      int val;
      ListNode next;

      ListNode(int x)
      {
          val = x;
      }
  }