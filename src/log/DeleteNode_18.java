package log;

/**
 * 面试题18. 删除链表的节点
 * 给定单向链表的头指针和一个要删除的节点的值，定义一个函数删除该节点。
 * 返回删除后的链表的头节点。
 * */
public class DeleteNode_18 {


    public ListNode deleteNode(ListNode head, int val) {
        if (head == null) return head;
        if (head.val == val) return head.next;

        ListNode p = head;
        while (p.next != null && p.next.val != val) {
            p = p.next;
        }
        if (p.next != null)
            p.next = p.next.next;
        return head;
    }

}
