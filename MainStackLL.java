public class MainStackLL 
{
    public static void main(String[] args) 
    {
        StackLL stack = new StackLL();

        System.out.println("------");
        System.out.println("Initially");
        System.out.println("------");

        stack.display();

        System.out.println();
        System.out.println(stack.isEmpty());

        System.out.println("------");
        System.out.println("Push ops");
        System.out.println("------");

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println();

        stack.display();

        System.out.println("-------");
        System.out.println("Peek top element");
        System.out.println("-------");

        System.out.println("Top element : "+stack.peek());

        System.out.println("-------");
        System.out.println("Peek by position");
        System.out.println("-------");

        System.out.println("Pos 1 :"+stack.peek(1));
        System.out.println("Pos 2 :"+stack.peek(2));
        System.out.println("Pos 3 :"+stack.peek(3));
        System.out.println("Pos 4 :"+stack.peek(4));
        System.out.println("Pos 5 :"+stack.peek(5));

        System.out.println("-------");
        System.out.println("Pop operations");
        System.out.println("-------");

        System.out.println("Popped element : "+stack.pop());

        System.out.println();

        stack.display();

        System.out.println("-------");
        System.out.println("Top after pop");
        System.out.println("-------");

        System.out.println("Top Element : "+stack.peek());

        System.out.println("-------");
        System.out.println("pop remaining elements");
        System.out.println("-------");

        System.out.println("Popped element : "+stack.pop());
        System.out.println("Popped element : "+stack.pop());
        System.out.println("Popped element : "+stack.pop());
        System.out.println("Popped element : "+stack.pop());

        stack.display();

        System.out.println();

        System.out.println("Is empty : "+stack.isEmpty());

        System.out.println();

        System.out.println("Try one more pop");

        System.out.println(stack.pop());

        System.out.println();

        System.out.println("Try peek on empty stack");

        System.out.println(stack.peek());
    }
    
}
