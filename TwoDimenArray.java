public class TwoDimenArray
{
    public static void main(String[] args) 
    {
        int[][] array = {{1,2,3},{4,5,6}};
        
        /* for(int i = 0; i < array.length; i++)
        {
            for(int j = 0; j < array[i].length; j++)
            {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        } */
       /* System.out.println(array);

       System.out.println(array.length);

       System.out.println(array[0].length); */

       //Using for - each loop
       for(int[] x : array)
       {
            for(int y : x)
            {
                System.out.print(y+" ");
            }
            System.out.println();
       }
        
    }
}