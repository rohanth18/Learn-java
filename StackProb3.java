public class StackProb3 
{
    public static void main(String[] args) 
    {
        Stack3 stack = new Stack3(5);

        stack.push(19);
        stack.push(20);

        System.out.println(stack.peek(1));
        System.out.println(stack.peek(2));
        
    }
    
}
