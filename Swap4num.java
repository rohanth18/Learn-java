public class Swap4num {
    public static void main(String[] args) {
        int num1=23;
        int num2=19;
        int num3=12;
        int num4=7;


        System.out.println("Before Swapping:");
        System.out.println("num1="+num1);
        System.out.println("num2="+num2);
        System.out.println("num3="+num3);
        System.out.println("num4="+num4);

        
        int temp=num1;
        num1=num4;
        num4=num3;
        num3=num2;
        num2=temp;
        System.out.println("After Swapping using extra memory:");
        System.out.println("num1="+num1);
        System.out.println("num2="+num2);
        System.out.println("num3="+num3);
        System.out.println("num4="+num4);

        num1=num1+num2+num3+num4;
        num2=num1-num2-num3-num4;
        num3=num1-num2-num3-num4;
        num4=num1-num2-num3-num4;
        num1=num1-num2-num3-num4;

        System.out.println("After Swapping without using extra memory but using addition and subtraction:");
        System.out.println("num1="+num1);
        System.out.println("num2="+num2);
        System.out.println("num3="+num3);
        System.out.println("num4="+num4);

        num1=num1*num2*num3*num4;
        num2=num1/num2/num3/num4;
        num3=num1/num2/num3/num4;
        num4=num1/num2/num3/num4;
        num1=num1/num2/num3/num4;

        System.out.println("After Swapping without using extra memory but using multiplication and division:");
        System.out.println("num1="+num1);
        System.out.println("num2="+num2);
        System.out.println("num3="+num3);
        System.out.println("num4="+num4);




    }
    
}
