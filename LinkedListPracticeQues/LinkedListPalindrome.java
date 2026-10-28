package LinkedListPracticeQues;

public class LinkedListPalindrome 
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
    public static boolean isLinkedListPalindrome(Node head)
    {
        /* int num = 0;
        ListNode currentNode = head;
        while(currentNode != null)
        {
            num = num*10 + currentNode.val;
            currentNode = currentNode.next;
        }
        int numcopy = num;
        int rev = 0;
        while(numcopy != 0)
        {
            int digit = numcopy%10;
            rev = rev*10+digit;
            numcopy=numcopy/10;
        }
        if(rev == num)
        {
            return true;
        }
        return false; */
        int count = 0;
        Node currentNode = head;
        while(currentNode != null)
        {
            count++;
            currentNode = currentNode.next;
        }
        int[] array = new int[count];
        int i = 0;
        Node current = head;
        while(i < array.length)
        {
            array[i] = current.data;
            i++;
            current = current.next;
        }
        int j = array.length - 1;
        for(int k = 0; k < array.length; k++)
        {
            if(array[k] != array[j])
            {
                return false;
            }
            j--;
        }
        return true;
    }
    public static void main(String[] args) 
    {
        Node head = null;
        head = insertAtEnd(1, head);
        head = insertAtEnd(2, head);
        head = insertAtEnd(3, head);
        head = insertAtEnd(1, head);
        head = insertAtEnd(1, head);

        boolean result = isLinkedListPalindrome(head);
        if(result == true)
        {
            System.out.println("Linked list is palindrome");
        }
        else
        {
            System.out.println("Linked list is not palindrome");
        }
    }
}
