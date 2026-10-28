package LinkedListPracticeQues;

public class Return5thEvenNode 
{
    public static void printLinkedList(Node head)
    {
        Node monkey = head;
        System.out.print("\nhead -> ");
        while(monkey != null)
        {
            System.out.print(monkey.data +" -> ");
            monkey = monkey.next;
        }
        System.out.print("null");
    }
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
    public static Node get5thEvenNodeElement(Node head)
    {
        if(head == null)
        {
            return null;
        }
        Node currentNode = head;
        int position = 0;
        int evenPosition = 0;
        while(currentNode != null)
        {
            position++;
            if(position % 2 == 0)
            {
                evenPosition++;
            }
            if(evenPosition == 5)
            {
                return currentNode;
            }
            currentNode = currentNode.next;
        }
        return null;
    }
    public static void main(String[] args) 
    {
        Node head = null;
        head = insertAtEnd(100, head);
        head = insertAtEnd(101, head);
        head = insertAtEnd(102, head);
        head = insertAtEnd(104, head);
        head = insertAtEnd(105, head);
        head = insertAtEnd(106, head);
        head = insertAtEnd(107, head);
        head = insertAtEnd(108, head);
        head = insertAtEnd(109, head);
        head = insertAtEnd(110, head);
        head = insertAtEnd(111, head);
        head = insertAtEnd(112, head);
        head = insertAtEnd(113, head);
        head = insertAtEnd(114, head);

        printLinkedList(head);

        Node fifthEvenPosition = get5thEvenNodeElement(head);
        if(fifthEvenPosition == null)
        {
            System.out.println("\n5th even node not exist in Linked list");
        }
        else
        {
            System.out.println("\n5th even position element = "+ fifthEvenPosition.data);
        }
    }
}
