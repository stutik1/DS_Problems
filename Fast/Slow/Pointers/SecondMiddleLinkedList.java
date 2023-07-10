package Fast.Slow.Pointers;
class ListNodes{
    int value =0;
    ListNode next;

    ListNodes(int value){
        this.value = value;
    }
}

public class SecondMiddleLinkedList {
    public static ListNode secondMiddleLinkedList(ListNode head){
        ListNode slow= head;
        ListNode fast= head;
        while (fast!= null && fast.next!= null ){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static void main(String args[]){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println(SecondMiddleLinkedList.secondMiddleLinkedList(head).value);

        head.next.next.next.next.next = new ListNode(6);
        System.out.println(SecondMiddleLinkedList.secondMiddleLinkedList(head).value);

        head.next.next.next.next.next.next = new ListNode(7) ;
        head.next.next.next.next.next.next.next = new ListNode(8) ;
        System.out.println(SecondMiddleLinkedList.secondMiddleLinkedList(head).value);
    }
}
