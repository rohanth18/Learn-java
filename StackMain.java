public class StackMain 
{
    public static void main(String[] args) 
    {
        Stack stack = new Stack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println();

        stack.display();

        System.out.println();

        System.out.println("Top element "+stack.stackTop());

        System.out.println();

        System.out.println("Element at position 1 "+stack.peek(1));
        System.out.println("Element at position 2 "+stack.peek(2));
        System.out.println("Element at position 3 "+stack.peek(3));
        System.out.println("Element at position 4 "+stack.peek(4));
        System.out.println("Element at position 5 "+stack.peek(5));

        System.out.println("Deleted "+stack.pop());
        System.out.println("Deleted "+stack.pop());

        System.out.println();

        System.out.println(stack.isEmpty());

        System.out.println(stack.isFull());

    }
    
}
