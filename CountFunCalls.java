public class CountFunCalls 
{
    static int count = 0;
    static void countFunCalls(int n)
    {
        
        count++;
        if(n == 3){
            System.out.println(count);
            return;
        }
        countFunCalls(n - 1);
        
    }
    public static void main(String[] args) 
    {
        countFunCalls(10);
        
    }
    
}
