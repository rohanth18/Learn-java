public class StackOperation 
{
    public static void main(String[] args) 
    {
        Stack myStack = new Stack(5);
        System.out.println("Array after pushing values");
        myStack.push(2);
        myStack.printStack();

        System.out.println("Array after pushing values");
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);
        myStack.push(6);
        myStack.printStack();

        myStack.push(6);
        
        int value = myStack.peek();
        System.out.println("ELement at the top of stack = "+value);

        myStack.pop();
        System.out.println("Array after popping");
        myStack.printStack();
        


        
    }
    
}
