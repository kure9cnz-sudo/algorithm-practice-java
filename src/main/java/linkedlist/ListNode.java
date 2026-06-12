package linkedlist;

/**
 * 单链表节点。
 *
 * <p>这是链表练习的基础数据结构，不包含算法答案。</p>
 */
public class ListNode {
    public int value;
    public ListNode next;

    public ListNode(int value) {
        this.value = value;
    }

    public ListNode(int value, ListNode next) {
        this.value = value;
        this.next = next;
    }
}
