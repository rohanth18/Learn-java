public class Stack 
{
    int size; 
    int top;
    int[] stack;

    Stack(int size)
    {
        this.size = size;
        top = -1;
        stack = new int[size]; //Array create agirodu
    }

    //isEmpty
    public boolean isEmpty()
    {
        return top == -1;
    }
    
    //isFull
    public boolean isFull()
    {
        return top == size - 1;
    }

    //push()
    public void push(int value)
    {
        if(isFull())
        {
            System.out.println("Stack overflow");
            return;
        }

        top++;
        stack[top] = value;

        System.out.println(value+" inserted into stack");
    }

    //pop
    int pop()
    {
        if(isEmpty())
        {
            System.out.println("Stack is empty");
            return -1;
        }
        
        int value = stack[top];
        top--;
        return value;
    }

    //stackTop()
    int stackTop()
    {
        if(isEmpty())
        {
            System.out.println("Stack is empty");
            return -1;
        }

        return stack[top];
    }

    //peek()
    int peek(int position)
    {
        int index = top - position + 1;

        if(index < 0 || index > top)
        {
            System.out.println("invalid position");
            return -1;
        }
        return stack[index];
    }

    void display()
    {
        if(isEmpty())
        {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("\nStack elements");

        for(int i = top; i >= 0; i--)
        {
            System.out.println(stack[i]);
        }
    }
    
}
