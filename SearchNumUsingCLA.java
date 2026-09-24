public class SearchNumUsingCLA 
{
    public static void main(String[] args) 
    {
        int search=20;
        for(String x:args)
        {
            int num=Integer.parseInt(x);
            if(num==search)
            {
                System.out.println("Number existed");

            }
        }
        
    }
    
}
