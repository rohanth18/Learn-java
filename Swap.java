public class Swap 
{ 
    public static void main(String[] args) {
        int value1=10;
        int value2=20;
        int temp;
         System.out.println("Before Swapping");
        System.out.println("value1="+value1);
        System.out.println("value2="+value2);
        temp=value1;
        value1=value2;
        value2=temp;
        System.out.println();
        System.out.println("After Swapping");
        System.out.println("value1="+value1);
        System.out.println("value2="+value2);
    }  
}
