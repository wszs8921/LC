package test;

/**
 * @author adwstart
 * @create 2022-04-28 14:02
 */
public class Reverse
{
    public ListNode reverseList(ListNode head) {
        if(head==null)
            return null;
        ListNode pre=null,cur=head,next=head.next;
        while(next!=null)
        {
            cur.next=pre;
            pre=cur;
            cur=next;
            next=next.next;
        }
        cur.next=pre;
        return cur;
    }
}
class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
