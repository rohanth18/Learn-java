public class IncreDecrement 
{
    public static void main(String[] args) 
    {
        int count=10;
        System.out.println(count++);//10
        System.out.println(count);//11
        System.out.println(count++);//11
        System.out.println(count++);//12
        System.out.println(count);//13

        System.out.println(count--);//13
        System.out.println(count);//12
        System.out.println(count--);//12
        System.out.println(count--);//11

        System.out.println(++count);//11
        System.out.println(count);//11
        System.out.println(++count);//12
        System.out.println(++count);//13

        System.out.println(--count);//12
        System.out.println(count);//12
        System.out.println(--count);//11
        System.out.println(count);//11

        int store=count;
        store++;
        System.out.println(store);//12

        int count1=12;
        int count2=count1++;
        System.out.println(count2);//12
        System.out.println(count1);//13

        int count3=13;
        int count4=++count3;
        System.out.println(count4);//14
        System.out.println(count3);//14

        System.out.println("Beh in expression");
        int c=10;
        System.out.println(c++ + 5);//15
        System.out.println(c);//11
        System.out.println(++c + 5);//12+5=17
        System.out.println(c);//12

        System.out.println("Conf beh in expression");
        int num=10;
        System.out.println(num++ + ++num);;//10+12=22

        System.out.println("Conf beh in expression");
        int num1=11;
        System.out.println(num1++ + num1++);;//11+12=23

        int num2=12;
        System.out.println(num2++ - ++num2);//-2

        int num3=20;
        System.out.println(++num3 + --num3);//21+20=41

        System.out.println("In expression");
        int num4=5;
        int num5=10;
        System.out.println(num4++ + ++num5 );//5+11=16
        System.out.println(num4);//6
        System.out.println(num5);//11

        System.out.println("In expression");
        int x=4;
        System.out.println(++x + x++);//5+5=10
        System.out.println(x);//6
        

        //assignment
        //give 2 easy,2 medium and 6 tough and taking 3 variables

        int a1 = 10;
        int b1 = 20;
        int c1 = 30;

        a1++;
        b1++;
        c1--;

        System.out.println(a1);
        System.out.println(b1);
        System.out.println(c1);
        System.out.println();

        int a2 = 5;
        int b2 = 10;
        int c2 = 15;

        ++a2;
        --b2;
        c2++;

        System.out.println(a2);
        System.out.println(b2);
        System.out.println(c2);
        System.out.println();

        int a3 = 10;
        int b3 = 20;
        int c3 = 30;

        System.out.println(a3++);
        System.out.println(++b3);
        System.out.println(c3--);

        System.out.println(a3);
        System.out.println(b3);
        System.out.println(c3);
        System.out.println();

        int a4 = 5;
        int b4 = 10;
        int c4 = 15;

        int x1 = a4++;
        int y1 = ++b4;
        int z1 = c4--;

        System.out.println(x1);
        System.out.println(y1);
        System.out.println(z1);

        System.out.println(a4);
        System.out.println(b4);
        System.out.println(c4);

        System.out.println();
        int a5 = 10;
        int b5 = 20;
        int c5 = 30;

        System.out.println(a5++ + ++b5);
        System.out.println(--c5 + a5++);

        System.out.println(a5);
        System.out.println(b5);
        System.out.println(c5);

        System.out.println();
        int a6 = 10;
        int b6 = 20;
        int c6 = 30;

        System.out.println(a6++ + b6++ + ++c6);

        System.out.println(--a6 + ++b6 + c6--);

        System.out.println(a6);
        System.out.println(b6);
        System.out.println(c6);

        System.out.println();
        int a7 = 5;
        int b7 = 10;
        int c7 = 15;

        System.out.println(++a7 + b7++ + c7--);

        System.out.println(a7-- + ++b7 + ++c7);

        System.out.println(a7);
        System.out.println(b7);
        System.out.println(c7);

        System.out.println();
        int a8 = 10;
        int b8 = 20;
        int c8 = 30;

        int x2 = a8++ + ++b8;
        int y2 = c8-- + ++a8;
        int z2 = --b8 + c8++;

        System.out.println(x2);
        System.out.println(y2);
        System.out.println(z2);

        System.out.println(a8);
        System.out.println(b8);
        System.out.println(c8);

        System.out.println();
        int a9 = 10;
        int b9 = 20;
        int c9 = 30;

        System.out.println(a9++ + ++a9 + b9);
        System.out.println(b9++ + --b9 + c9);
        System.out.println(++c9 + c9-- + a9);

        System.out.println(a9);
        System.out.println(b9);
        System.out.println(c9);

        System.out.println();
        int a10 = 10;
        int b10 = 20;
        int c10 = 30;

        System.out.println(a10++ + ++b10 + c10--);
        System.out.println(++a10 + b10-- + ++c10);
        System.out.println(a10-- + ++b10 + c10++);

        System.out.println(a10);
        System.out.println(b10);
        System.out.println(c10);


    }
    
}
