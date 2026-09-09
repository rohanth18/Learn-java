/* public class Methods 
{

    static void display()//this belongs to class, no need of object
    {
        System.out.println("hello");//hello
    }
    public static void main(String[] args) {
        display();
    }
    
} */

//with return type
public class Methods{
    static int max(int x,int y)//x=10,y=15 -- rec data -- formal parameters
    {
        if(x>y)
        {
            return x;
        }
        else
        {
            return y;//return 15
        }
        //scope checking
        //System.out.println(a);//a is not in this method
        

    }

    public static void main(String[] args) {
        int a=10,b=15;//parameter passing -- send data -- actual parameters
        int c=max(a,b);
        System.out.println(c);
        //System.out.println(x); //x is not in this method
    }
}