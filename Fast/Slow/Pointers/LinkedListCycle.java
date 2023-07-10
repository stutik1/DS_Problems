package Fast.Slow.Pointers;

class ListNode {
    int value = 0;
    ListNode next;

    ListNode(int value) {
        this.value = value;
    }
}

public class LinkedListCycle {
    public static boolean linkedListCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null &&  fast.next != null) {
            fast = fast.next.next.next;
            slow = slow.next;

            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next.next = new ListNode(7) ;

        System.out.println(LinkedListCycle.linkedListCycle(head));

        head.next.next.next.next.next.next = head.next.next;
        System.out.println(LinkedListCycle.linkedListCycle(head));

        head.next.next.next.next.next.next = head.next.next.next.next;
        System.out.println(LinkedListCycle.linkedListCycle(head));
    }
}
