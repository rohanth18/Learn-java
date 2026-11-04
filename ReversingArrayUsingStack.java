public class ReversingArrayUsingStack 
{
    static void printArray(int[] array)
    {
        for(int i = 0; i < array.length; i++)
        {
            System.out.print(array[i]+ " ");
        }
    }
    static void reverseArrayUsingStack(int[] array)
    {
        MyStack stack = new MyStack(array.length);
        for(int i = 0; i < array.length; i++)
        {
            stack.push(array[i]);
        }

        for(int i = 0; i < array.length; i++)
        {
            array[i] = stack.pop();
        }
    }
    public static void main(String[] args) 
    {
        int[] array = {1,2,3,4,5,6};
        System.out.println("Original array");
        printArray(array);
        reverseArrayUsingStack(array);
        System.out.println("\nreversed array");
        printArray(array);

        
    }
    
}
