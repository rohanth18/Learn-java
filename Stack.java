public class Stack 
{
    int[] stack;
    int size;
    int top;

    Stack(int size)
    {
        this.stack = new int[size];
        this.size = size;
        this.top = -1;
    }

    public void push(int value)
    {
        
        if(top == size-1)
        {
            System.out.println("Stack is full");
            return;
        }
        top++;
        stack[top] = value;
        
    }

    public void pop()
    {
        if(top == -1)
        {
            System.out.println("Stack is empty");
            return;
        }
        top--;
    }

    public int peek()
    {
        if(top == -1)
        {
            System.out.println("Stack is empty");
            return top;
        }
        return stack[top];
    }
    public void printStack()
    {
        for(int i = 0; i < size; i++)
        {
            System.out.println(stack[i]);
        }
    }
    
}
