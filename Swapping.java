public class Swapping {
    public static void main(String[] args) {

        // Swapping 3 variables
        int firstNumber = 10;
        int secondNumber = 20;
        int thirdNumber = 30;
        
        System.out.println("Before swapping 3 variables:");
        System.out.println("firstNumber="+firstNumber);
        System.out.println("secondNumber="+secondNumber);
        System.out.println("thirdNumber="+thirdNumber);

        int temporary = firstNumber;
        firstNumber = secondNumber;
        secondNumber = thirdNumber;
        thirdNumber = temporary;

        System.out.println("\nAfter swapping 3 variables:");
        System.out.println("firstNumber="+firstNumber);
        System.out.println("secondNumber="+secondNumber);
        System.out.println("thirdNumber="+thirdNumber);


        // Swapping 4 variables
        int firstValue = 10;
        int secondValue = 20;
        int thirdValue = 30;
        int fourthValue = 40;
       System.out.println("\nBefore swapping 4 variables:");
        System.out.println("firstValue="+firstValue);
        System.out.println("secondValue="+secondValue);
        System.out.println("thirdValue="+thirdValue);
        System.out.println("fourthValue="+fourthValue);
        int temp = firstValue;
        firstValue = secondValue;
        secondValue = thirdValue;
        thirdValue = fourthValue;
        fourthValue= temp;

        System.out.println("\nAfter swapping 4 variables:");
        System.out.println("firstValue="+firstValue);
        System.out.println("secondValue="+secondValue);
        System.out.println("thirdValue="+thirdValue);
        System.out.println("fourthValue="+fourthValue);
    }
}
