public class FindMaxIn2DArray 
{
    static int findMaxIn2DArray(int[][] array)
    {
        
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < array.length; i++)
        {
            for(int j = 0; j < array[i].length; j++)
            {
                if(array[i][j] > max)
                {
                    max = array[i][j];
                }
            }
        }
        return max;
    } 
    public static void main(String[] args) 
    {
        int[][] array = {{1,11,24,34},{102,113,205}};
        int max = findMaxIn2DArray(array);
        System.out.println(max);
        
    }
    
}
