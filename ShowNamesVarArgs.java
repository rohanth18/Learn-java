public class ShowNamesVarArgs 
{
    static void showNames(String... names)
    {
        for(String name:names)
        {
            System.out.println(name);
        }
    }
    public static void main(String[] args) 
    {
        showNames("Praveen","Pavan","Rajath","Sunil","Uday");
        
    }
    
}
