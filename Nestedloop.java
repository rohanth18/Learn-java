public class Nestedloop 
{
    public static void main(String[] args) 
    {
       /*  for(int i=1;i<=3;i++)
        {
            for(int j=1;j<=3;j++)
            {
                System.out.print(j);///123 
                //                     123
                //                     123
            }
            System.out.println();
        } */
        /* for(int i=1;i<=3;i++)
        {
            for(int j=1;j<=3;j++)
            {
                System.out.print(i);/// 111 
                //                      222 
                //                      333
            }
            System.out.println();
        } */
       /* for(int i=1;i<=3;i++)
        {
            for(int j=1;j<=3;j++)
            {
                System.out.print('*');
            }
            System.out.println();
        } */
       for(int i=1;i<=3;i++)
        {
            for(int j=1;j<=3;j++)
            {
                System.out.print("("+i+","+j+")");
            }
            System.out.println();
        }

        
        
    }
    
}
