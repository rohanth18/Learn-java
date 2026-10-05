public class SinglyLinkedList 
{
    public static void main(String[] args) 
    {
        //testInsertAtStart();
        //testInsertAtEnd(); 
        //testInsertAfterKey();
        //testDeleteOperations();
        testDeleteKeyNode();
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

    public static void testInsertAtStart()
    {
        Node head = null;
        printLinkedList(head);//function invocation

        head = insertAtStart(100, head);
        printLinkedList(head);
        
        //
        head = insertAtStart(101, head);
        printLinkedList(head);

        head = insertAtStart(102, head);
        printLinkedList(head);

        head = insertAtStart(103, head);
        printLinkedList(head);
        
        head = insertAtStart(105, head);
        printLinkedList(head);

        


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
    static void testInsertAtEnd()
    {Node head = null;
        head = insertAtEnd(100, head);
        printLinkedList(head);

        head = insertAtEnd(101, head);
        printLinkedList(head);

        head = insertAtEnd(102, head);
        printLinkedList(head);

        head = insertAtEnd(104, head);
        printLinkedList(head);

    }

    static void insertAfterKey(Node head, int key, int value)
    {
        Node newNode = new Node();
        newNode.data = value;
        newNode.next = null;

        if(head == null)
        {
            return;
        }
        if(head.data == key)
        {
            head.next = newNode;
        }
        Node keyNode = head;
        while(keyNode != null && keyNode.data != key)
        {
            keyNode = keyNode.next;
        }
        if(keyNode == null)
        {
            return;
        }
        newNode.next = keyNode.next;
        keyNode.next = newNode;

    }
    static void testInsertAfterKey()
    {
        Node head = null;
        insertBeforeKey(head, 105, 104);
        printLinkedList(head);
    }
    static void insertBeforeKey(Node head, int key, int value)
    {
        Node newNode = new Node();
        newNode.data = value;
        newNode.next = null;

        if(head == null)
        {
            return ;
        }
        else if(head.data == key)
        {
            newNode.next = head;
            head = newNode;
            return ;
        }
        else{
        Node keyNode = head;
        while( keyNode.next.data != key)
        {
            keyNode = keyNode.next;
        
        }
        if(keyNode == null)
        {
            return;
        }
    
        newNode.next = keyNode.next;
        keyNode.next = newNode;
    }

    
    }
    public static Node deleteAtStart(Node head)
    {
        if(head == null)
        {
            System.out.print("List is empty, No node to delete");
            return null;
        }
        return head.next;
    }

    public static void testDeleteOperations()
    {
        Node head = null;
        System.out.println("Deleting at Start");
        deleteAtStart(head);

        head = insertAtEnd(1, head);
        printLinkedList(head);

        head = deleteAtStart(head);
        printLinkedList(head);


        System.out.print("\nDeleting at end");
        head = deleteAtEnd(head);
        printLinkedList(head);

        head = insertAtEnd(1, head);
        printLinkedList(head);

        head = deleteAtEnd(head);
        printLinkedList(head);

        head = insertAtEnd(1, head);
        head = insertAtEnd(2, head);
        printLinkedList(head);

        head = deleteAtEnd(head);
        printLinkedList(head);

        head = insertAtEnd(1, head);
        head = insertAtEnd(2, head);
        head = insertAtEnd(3, head);
        head = insertAtEnd(4, head);
        printLinkedList(head);

        head = deleteAtEnd(head);
        printLinkedList(head);

    }

    

    public static Node deleteAtEnd(Node head)
    {
        
        if(head == null || head.next == null)
        {
            return null;
        }
        Node lastButOneNode = head;
        while(lastButOneNode.next.next != null)
        {
            lastButOneNode = lastButOneNode.next;
        }
        lastButOneNode.next = null;
        return head;
    }
    public static Node deleteKeyNode(Node head, int key)
    {
        //List is empty
        if(head == null)
        {
            return null;
        }

        //List has only one node and that node is a keynode
        if(head.data == key)
        {
            return head.next;
        }
        else if(head.next == null && head.data == key)
        {
            return null;
        }
        //List has more than one node
        Node prevNode = head;
        Node keyNode = head.next;
        
        while(keyNode != null)
        {
            if(keyNode.data == key)
            {
                break;
            }
            prevNode = keyNode;
            keyNode = keyNode.next;
        }
        if(keyNode!=null && keyNode.data == key)
        {
            prevNode.next = keyNode.next;
        }
        return head;
    }

    public static void testDeleteKeyNode()
    {
        Node head = null;
        System.out.println("If the list is empty");
        head = deleteKeyNode(head, 2);
        printLinkedList(head);//head -> null

        //Only one is present and that node is key
        head = insertAtEnd(1, head);
        printLinkedList(head);//head -> 1 -> null
        head = deleteKeyNode(head, 1);
        printLinkedList(head);//head -> null

       //Only one node and keynode is not present
        head = insertAtStart(1, head);
        printLinkedList(head);//head -> 1 -> null
        head = deleteKeyNode(head, 2);
        printLinkedList(head);

        //Two nodes are present and first is keyNode
        head = insertAtEnd(2, head);
        printLinkedList(head);//head -> 1 -> 2 -> null
        head = deleteKeyNode(head, 1);
        printLinkedList(head);//head -> 1 -> null

        //Two nodes are present and second node is keyNode
        head = insertAtStart(1, head);
        printLinkedList(head);//head -> 1 -> 2 ->null
        head = deleteKeyNode(head, 2);
        printLinkedList(head);//head -> 1 -. null

        //Two nodes and key not present
        head = insertAtEnd(2, head);
        printLinkedList(head);//head -> 1 -> 2 -> null
        head = deleteKeyNode(head, 3);
        printLinkedList(head);//head -> 1 -> 2 -> null

        //many nodes key is in middle
        head = insertAtEnd(3, head);
        head = insertAtEnd(4, head);
        head = insertAtEnd(5, head);
        printLinkedList(head);
        head = deleteKeyNode(head, 3);
        printLinkedList(head);

        //many nodes and keyNode is at last
        head = deleteKeyNode(head, 5);
        printLinkedList(head);

         //many nodes and keyNode is not present
        head = deleteKeyNode(head, 6);
        printLinkedList(head);



 
    }

}
