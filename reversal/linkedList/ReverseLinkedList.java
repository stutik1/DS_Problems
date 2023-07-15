package reversal.linkedList;
class ListNode{
    int value ;
    ListNode next;

    ListNode(int value){
        this.value = value;
    }
}

public class ReverseLinkedList {
    public static ListNode reverseLinkedList(ListNode head){
        ListNode current = head;
        ListNode previous = null;
        ListNode next = null;

        while ( current!= null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }
    public static void main(String[] args){
        ListNode head = new ListNode(2);
        head.next = new ListNode(4);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(8);
        head.next.next.next.next= new ListNode(10);

       ListNode result = ReverseLinkedList.reverseLinkedList(head);
        System.out.print("Reverse of LinkedList : ");
        while (result != null){
            System.out.print(result.value + " " );
            result = result.next;
        }
    }
}
