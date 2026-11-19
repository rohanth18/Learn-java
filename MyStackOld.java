public class MyStackOld {

    private int[] stack;
    private int top = -1;
    private int stackMaxSize = 0;

    public MyStackOld(int size)
    {
        this.stack = new int[size];
        stackMaxSize = size;
    }
    
    public void push(int data)
    {
        if (this.top == this.stackMaxSize-1) 
        {
            System.out.println("Push failed! Stack is full");
            return;
        }
        this.top++;
        this.stack[top] = data;

    }

    public int pop()
    {
        if (this.top == -1)
        {
            System.out.println("Pop failed, stack is empty");
            return -1;
        }
        
        int value = this.stack[top];
        this.top--;
        return value;

    }

    public int peek()
    {
        if (this.top == -1)
        {
            System.out.println("Peek failed, stack is empty");
            return -1;
        }

        return this.stack[this.top];
    }

    public void print()
    {
        if (this.top == -1)
        {
            System.out.println("Stack is empty");
            return;
        }

        for (int i = this.top; i >=0; i--)
        {
            System.out.println(" [ " + i + " ]  --> " + this.stack[i]);
        }
    }
}
