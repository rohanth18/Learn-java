public class Nesteddowhile 
{
    public static void main(String[] args) 
    {
        int i=1;
        
        do
        {
            int j=1;

            
            {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;

        }while(i<=3);
        
    }
    
}
