public class PatternsInArray 
{
    static void printLeftToRight(int[] Numbers)
    {
        System.out.println("Printing Array Elements Left to Right");
        for(int i = 0;i < Numbers.length;i++)
        {
            System.out.print(Numbers[i]);
            if(i<Numbers.length-1)
            {
                System.out.print(" -> ");
            }
        }
        System.out.println();
    }
    static void printRightToLeft(int[] Numbers)
    {
        System.out.println("Printing Array Elements Right to Left");
        for(int i = Numbers.length-1;i>=0;i--)
        {
            System.out.print(Numbers[i]);
            if(i>0)
            {
                System.out.print(" -> ");
            }
        }
    }
    static void printFromBothSides(int[] Numbers)
    {
        System.out.println();
        System.out.println("Printing Array elements from both sides");
        int left = 0;
        int right = Numbers.length-1;
        while(left<=right)
        {
            System.out.print(Numbers[left]+" -> ");

            System.out.print(Numbers[right]+" -> ");
            left++;
            right--;
        }
    }
    static void printFromCenterTowardsEnd(int[] Numbers)
    {
        System.out.println("\nPrinting from center towards center");
        int left=0;
        int right=0;

        if(Numbers.length%2==0)
        {
            left = Numbers.length/2-1;
            right = Numbers.length/2;
        }
        else
        {
            left = Numbers.length/2;
            right = Numbers.length/2;
        }
        
        while(left>=0 && right<Numbers.length)
        {
            if(left==right)
            {
                System.out.print(Numbers[left]+" -> ");
                left--;
                right++;
            }
            else{
            System.out.print(Numbers[left]+" -> "+Numbers[right]+" ->");
            left--;
            right++;
            }
        }

    }

    public static void main(String[] args) 
    {
        int[] Numbers = {1,2,3,4,5,6,7,8,9};

        printLeftToRight(Numbers);
        printRightToLeft(Numbers);
        printFromBothSides(Numbers);
        printFromCenterTowardsEnd(Numbers);
        
    }
    
}
