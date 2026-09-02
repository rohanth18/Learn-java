public class Timeconvert 
{
    public static void main(String[] args) {
        int sec=3600;
        float hr=(float)sec/(60*60);
        System.out.println("3600 in hr ="+hr+" hr");

        
        int sec1=44300;
        float hr1=(float)sec1/(60*60);
        System.out.println(sec1+" in hr ="+String.format("%.4f", hr1)+" hr");
    }    
}
