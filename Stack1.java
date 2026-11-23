public class Stack1 
{
    int top;
    int size;
    int[] stack;

    Stack1(int size)
    {
        this.size = size;
        top = -1;
        stack = new int[size];
    }

    void push(int value)
    {
        if(top == size - 1)
        {
            System.out.println("Stack is full");
            return ;
        }

        top++;
        stack[top] = value;
    }

    void display()
    {
        if(top == -1)
        {
            System.out.println("Stack is empty");
            return;
        }

        for(int i = top; i >= 0; i--)
        {
            System.out.println(stack[i]);
        }
    }
    
}
