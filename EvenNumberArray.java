public class EvenNumberArray 
{

    /* static int[] getEvenNumbers(int nums[])
    {
        int[] evenNumbers={2,4};
        return evenNumbers;
    } */

    public static void makeItHalf(int num)
    {
        num=num/2;
        
    }
    public static int makeItHalf_v2(int num)
    {
        num=num/2;
        return num;
    }

    static void makeItHalfByReference(int[] array)
    {
        array[0] = array[0]/2;
        
    }

    public static void makeItHalf(Data myData)
    {
        myData.number = myData.number/2;

    }
    

    public static void main(String[] args) 
    {/* 
        int[] userInput = {2,5,6,8};
        int[] evenNumbers=getEvenNumbers(userInput); */
        int number=10;
        makeItHalf(number);
        //System.out.println("Pass by value="+number);

        int number1=20;
        number1=makeItHalf_v2(number1);
        System.out.println("Pass by value="+number1);

        /* int[] array = {10,4,3,6};
        makeItHalfByReference(array); */
       /*  for(int i=0;i<array.length;i++)
        {
        System.out.print(array[i]+" ");
        } */
        //User defined datatype
        Data newdata = new Data();
        newdata.number = 100;
        makeItHalf(newdata);
        System.out.println("Pass by reference = "+newdata.number);


/* 
        for(int i=0;i<evenNumbers.length;i++)
        {
            System.out.println(evenNumbers[i]);
        }    */     
    }
    
}
