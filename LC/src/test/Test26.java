package test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author adwstart
 * @create 2022-05-09 15:31
 */
public class Test26
{
    public Node copyRandomList(Node head) {
        Node cur=head;
        HashMap<Node, Node> newNodeMap = new HashMap<>();
        while (cur!=null)
        {
            Node newNode = new Node(cur.val);
            newNodeMap.put(cur, newNode);
            cur=cur.next;
        }
        cur=head;
        while(cur!=null)
        {
            newNodeMap.get(cur).next=newNodeMap.get(cur.next);
            newNodeMap.get(cur).random=newNodeMap.get(cur.random);
            cur=cur.next;
        }
        return newNodeMap.get(head);
    }
}

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}