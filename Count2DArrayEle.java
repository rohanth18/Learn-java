public class Count2DArrayEle 
{
    static int count2DArrayElements(int[][] array)
    {
        if(array == null || array.length == 0)
        {
            return 0;
        }
        int count = 0;
        for(int i = 0; i < array.length; i++)
        {
            for(int j = 0; j < array[i].length; j++)
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) 
    {
        int[][] array = {{1,2,3},{2,4,6}};
        System.out.println(count2DArrayElements(array));
    }
}
