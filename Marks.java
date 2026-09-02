public class Marks {
    public static void main(String[] args) {
        int sub1=99;
        int sub2=87;
        int sub3=70;
       // int sub4=87;
        double obtained=sub1+sub2+sub3;
        double total=300;
        double average=obtained/3;
        float percentage=(float)(obtained/total)*100;
        System.out.println("Average = "+average);
        System.out.println("Percentage = "+String.format("%.4f", percentage));
    }
    
}
