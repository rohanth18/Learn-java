public class ReverseLinkedList {

    // Node class
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    // Reverse linked list
    public static ListNode reverseList(ListNode head) {

        ListNode previous = null;
        ListNode current = head;

        while (current != null) {
            ListNode next = current.next;

            current.next = previous;
            previous = current;
            current = next;
        }

        return previous;
    }

    // Print linked list
    public static void printList(ListNode head) {
        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        // Creating linked list:
        // 10 -> 20 -> 30 -> 40 -> null

        ListNode head = new ListNode(10);
        head.next = new ListNode(20);
        head.next.next = new ListNode(30);
        head.next.next.next = new ListNode(40);

        System.out.println("Before reversing:");
        printList(head);

        // Reverse the list
        head = reverseList(head);

        System.out.println("After reversing:");
        printList(head);
    }
}