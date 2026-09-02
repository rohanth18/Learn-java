public class Binary {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int search=4;
        for(int i=0;i<5;i++)
        {
            if (numbers[i]==search)
            {
                System.out.println(i+1);
            }
        }
    }
}
