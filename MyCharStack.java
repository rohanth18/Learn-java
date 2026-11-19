public class MyCharStack 
{
    private int top = -1;
    private int size;
    private char[] characters;

    public MyCharStack(int sizeOfStack)
    {
        this.characters = new char[sizeOfStack];
        this.size = sizeOfStack;
    }

    public void push(char character)
    {
        if(this.top == this.size-1)
        {
            System.out.println("Stack is full");
            return;
        }
        this.top++;
        this.characters[this.top] = character;
    }

    public char peek()
    {
        if(this.top == -1)
        {
            //System.out.println("Stack is empty idiot");
            return '*';
        }

        return this.characters[this.top];
    }

    public char pop()
    {
        if(this.top == -1)
        {
            System.out.println("Stack is empty idiot");
            return '*';
        }
        int index = this.top;
        this.top--;
        return this.characters[index];

    }
}

