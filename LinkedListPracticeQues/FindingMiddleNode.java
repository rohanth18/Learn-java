package LinkedListPracticeQues;

public class FindingMiddleNode 
{
    public static void printLinkedList(Node head)
    {
        Node currentNode = head;
        System.out.print("head -> ");
        while(currentNode != null)
        {
            System.out.print(currentNode.data +" -> ");
            currentNode = currentNode.next;
        }
        System.out.print("null");
    }
    public static int getNodeCount(Node head)
    {
        Node currentNode = head;
        int count = 0;
        while(currentNode != null)
        {
            count = count + 1;
            currentNode = currentNode.next;
        }
        return count;
    }
    public static Node findMiddleNode(Node head)
    {
        if(head == null)
        {
            return null;
        }

        Node slow = head;
        Node fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

    return slow;
    }
    public static void main(String[] args) {
        Node head = new Node();
        head.data = 10;

        head.next = new Node();
        head.next.data = 20; 

        head.next.next = new Node();
        head.next.next.data = 30;

        head.next.next.next = null;

        printLinkedList(head);
        Node middleNode = findMiddleNode(head);
        System.out.println("\n"+middleNode.data);

    }
}
