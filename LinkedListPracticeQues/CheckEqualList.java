package LinkedListPracticeQues;

public class CheckEqualList 
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
    public static boolean areLinkedListsEqual(Node head1, Node head2)
    {
        if(head1 == null && head2 == null)
        {
            return true;
        }
        Node List1Current = head1;
        Node List2Current = head2;
        while(List1Current != null && List2Current != null)
        {
            if(List1Current.data != List2Current.data)
            {
                return false;
            }
            List1Current = List1Current.next;
            List2Current = List2Current.next;
        }
        if(List1Current == null && List2Current == null)
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args) 
    {
        Node head1 = null;
        head1 = insertAtEnd(1, head1);
        head1 = insertAtEnd(2, head1);
        head1 = insertAtEnd(3, head1);
        head1 = insertAtEnd(4, head1);
        head1 = insertAtEnd(5, head1);

        Node head2 = null;
        head2 = insertAtEnd(1, head2);
        head2 = insertAtEnd(2, head2);
        head2 = insertAtEnd(3, head2);
        head2 = insertAtEnd(4, head2);
        head2 = insertAtEnd(5, head2);

        boolean result = areLinkedListsEqual(head1, head2);
        System.out.println(result);
    }
    
}
