public class ForEachEx 
{

    static void traverse(int[] a)
    {
        for(int x:a)
        {
            System.out.print(x+",");
        }
    }
    public static void main(String[] args) 
    {
        int[] arr = {1,2,3,4};
        traverse(arr);
        //traverseArray(new int[] {10,20,30,40});//anonymous array
        
    }
    
}
