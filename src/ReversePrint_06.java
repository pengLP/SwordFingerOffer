import java.util.List;

/**
 * 面试题06. 从尾到头打印链表
 * 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
 * */

public class ReversePrint_06 {

    public int[] reversePrint(ListNode head) {
        int len = 0;
        ListNode p = head;
        while (p != null) {
            len++;
            p = p.next;
        }
        int res[] = new int[len];
        p = head;
        for (int i = len-1;i >= 0; i-- ) {
            res[i] = p.val;
            p = p.next;
        }
        return res;
    }

}
