public class Bitwise 
{
    public static void main(String[] args) 
    {
        
        int x=10;
        int y=6;
        System.out.println("AND operation");
        int z=x&y;//AND operator
        System.out.println(z);
        System.out.println("OR operation");
        z=x|y;
        System.out.println(z);
        System.out.println("XOR operation");
        z=x^y;
        System.out.println(z);
        int x1=10;
        System.out.println("NOT operation");
        System.out.println(~x1);

        int a=10;
        System.out.println("Left Shift");
        System.out.println("Shift by 1 "+(a<<1));
        System.out.println("Shift by 2 "+(a<<2));
        System.out.println("Shift by 3 "+(a<<3));

        int b=50;
        System.out.println("Right");
        System.out.println("Shift by 1 "+(b>>1));
        System.out.println("Shift by 2 "+(b>>2));
        System.out.println("Shift by 3 "+(b>>3));

        int c=-10;
        System.out.println("Unsigned right shift");
        System.out.println("Shift by 1 "+(c>>>1));
        System.out.println("Shift by 2 "+(c>>>2));
        System.out.println("Shift by 3 "+(c>>>3));
        
        //Relational
        //Logical
        //Assignment
        //Unary
        int num1=10;
        int num2=20;
        int num3=10;
        System.out.println("Relational operators");
        System.out.println(num1+"=="+num2+":"+(num1==num2));
        System.out.println(num1+"=="+num3+":"+(num1==num3));
        System.out.println(num1+"!="+num2+":"+(num1!=num2));
        System.out.println(num1+"!="+num3+":"+(num1==num3));
        System.out.println(num1+"<"+num2+":"+(num1<num2));
        System.out.println(num1+">"+num2+":"+(num1>num2));
        System.out.println(num1+"<"+num2+":"+(num1<num2));
        System.out.println(num1+">="+num2+":"+(num1>=num2));
        System.out.println(num1+"<="+num2+":"+(num1<=num2));  

        System.out.println("Logical opertors");
        boolean b1=true;
        boolean b2=false;
        System.out.println("Logical AND");
        System.out.println(b1+"&&"+b2+"="+(b1&&b2));
        System.out.println("Logical OR");
        System.out.println(b1+"||"+b2+"="+(b1||b2));
        System.out.println("Logical NOT");
        System.out.println("!"+b2+"="+(!b2));

        System.out.println("Assignment operator");
        int a1=10;//actually "=" is a assignment operator
        System.out.println("a1="+a1);
        System.out.println(a1+"+=1 :"+(a1+=1));
        System.out.println(a1+"-=1 :"+(a1-=1));
        System.out.println(a1+"*=1 :"+(a1*=1));
        System.out.println(a1+"/=2 :"+(a1/=2));
        System.out.println(a1+"%=2 :"+(a1%=2));
        System.out.println(a1+"^=2 :"+(a1^=2));
        System.out.println(a1+"<<=2 :"+(a1<<=2));
        System.out.println(a1+">>=2 :"+(a1>>=2));
        System.out.println(a1+">>>=2 :"+(a1>>>=2));

        System.out.println("Unary operator");
        int a2=20;
        System.out.println("+a2="+(+a2));
        System.out.println("+a2="+(-a2));
        System.out.println("a2++="+(a2++));
        System.out.println("++a2="+(++a2));
        System.out.println("a2--="+(a2--));
        System.out.println("--a2="+(--a2));









    }
    
}
