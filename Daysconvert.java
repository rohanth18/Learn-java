public class Daysconvert 
{
    public static void main(String[] args) 
    {
        int days=550;
        float yrs=(float)days/365;
        //float yrs=days/365.0f; also be written
        float months=(float)(days/30.4);
        //float months=days/30.4f; also be written as
        System.out.println("Years ="+String.format("%.2f",yrs)+"yrs");
        System.out.println("Months ="+String.format("%.2f",months)+"months");
    }   
}
