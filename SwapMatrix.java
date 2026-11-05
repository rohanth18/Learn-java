public class SwapMatrix 
{
    static void print2DArray(int[][] array)
    {
        for(int i = 0; i < array.length; i++)
        {
           for(int j = 0; j < array[i].length; j++)
           {
                System.out.print(array[i][j]+" ");
           }
           System.out.println();
        }
    }
    static void swapMatrix(int[][] array)
    {
        for(int i = 0; i < array.length; i++)
        {
            int temp = array[i][0];
            array[i][0] = array[i][array[i].length - 1];
            array[i][array[i].length - 1] = temp;
        }
    }
    public static void main(String[] args) 
    {
        int[][] array = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Original array");
        print2DArray(array);

        swapMatrix(array);
        System.out.println("Array after swapping");
        print2DArray(array);
    }
}
