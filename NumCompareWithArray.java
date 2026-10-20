public class NumCompareWithArray 
{
    public static void compareWithArrayElements(int[] array, int number)
    {
        if(array == null)
        {
            System.out.println("Array is null");
            return;
        }
        
        if(array.length == 0)
        {
            System.out.println("Array is empty");
            return;
        }

        for(int i = 0; i < array.length; i++ )
        {
            if(number > array[i])
            {
                System.out.println(number+" > "+array[i]);
            }
            else if(number < array[i])
            {
                System.out.println(number+" < "+array[i]);
            }
            else
            {
                System.out.println(number+" == "+array[i]);
            }
        }
    }

    public static void main(String[] args) 
    {
        //int[] array = {10, 20, 30, 40, 50};
        //int[] array = null; 
        //int[] array = {};
        //int[] array = {10, 20, 20, 30};
        //int[] array = new int[0];
        //int[] array = {10};
        //int[] array = {20, 10, 5, 30, 40};
        int[] array = {-20, -10, 5, 30, 40};

        int number = 30;
        compareWithArrayElements(array, number);
        
    }
    
}
