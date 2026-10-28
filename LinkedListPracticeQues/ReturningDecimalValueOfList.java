package LinkedListPracticeQues;

public class ReturningDecimalValueOfList 
{
    public static Node insertAtEnd(int value, Node head)
    {
        //Creating a lastnode
        Node lastNode = new Node();
        lastNode.data = value;
        lastNode.next = null;

        //case 1: if linked list is empty
        if(head == null)
        {
            return lastNode;
        }

        //case 2: if linked list has one or more nodes
        Node currentLastNode = head;
        while(currentLastNode.next != null)
        {
            currentLastNode = currentLastNode.next;
        }
        currentLastNode.next = lastNode;

        return head;
    }
    public static int getDecimalOfList(Node head)
    {
        if(head == null)
        {
            return 0;
        }
        Node currentNode = head;
        int num = 0;
        while(currentNode != null)
        {
            num = num * 10 + currentNode.data;
            currentNode = currentNode.next;
        }
        int rev = 0;
        while(num != 0)
        {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }
        return rev;
    }
    public static void main(String[] args) 
    {
        Node head = null;
        head = insertAtEnd(1, head);
        head = insertAtEnd(2, head);
        head = insertAtEnd(3, head);
        head = insertAtEnd(4, head);
        head = insertAtEnd(5, head);
        
        int decimalNumber = getDecimalOfList(head);
        System.out.println(decimalNumber);

    }
    
}
