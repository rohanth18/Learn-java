public class SinglyLinkedList 
{
    public static void main(String[] args) 
    {
        Node head = null;
        printLinkedList(head);//function invocation

        head = insertAtStart(100, head);
        printLinkedList(head);
        
        
        head = insertAtStart(101, head);
        head = insertAtStart(102, head);
        head = insertAtStart(103, head);
        /*
        head = insertAtStart(104, head);
        printLinkedList(head); */

        insertAtEnd(104, head);
        printLinkedList(head);

        
    }

    //function definition
    public static Node insertAtStart(int value, Node currentHead)
    {
        Node newNode = new Node();//Creation of newnode and set the values
        newNode.data = value;
        newNode.next = null;

        //Test case - 1 : Head is null or list is empty
       /*  if(currentHead == null)
        {
            return newNode;
        }
        else
        {//Test case -2 : List is not empty there are one or more nodes
            newNode.next = currentHead;
            return newNode;
        } */
        if(currentHead != null)
        {
            newNode.next = currentHead;
        }
       return newNode;

    }

    //printing linked list
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
    
    public static void insertAtEnd(int value, Node head)
    {
        Node newNode = new Node();
        newNode.data = value;
        newNode.next = null;

        while(head.next != null)
        {
            head = head.next;
        }
        head.next = newNode;
    }
}
