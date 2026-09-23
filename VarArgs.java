public class VarArgs 
{
    static void show(int...a)
    {
        System.out.println("Arguments");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]);
            if(i!=a.length-1)
            {
                System.out.print(",");
            }
        }
        System.out.println();
    }
    /* static void show()
    {
        System.out.println("no args");
    }
    static void show(int a)
    {
        System.out.println("One argument");
    }
    static void show(int a, int b)
    {
        System.out.println("Two args");
    }
     */
    public static void main(String[] args) 
    {
        show();
        show(16);
        show(15,16); 
        show(15,16,17,18,19);//show(new int[]{15,16,17,18,19})

        
    }
    
}
