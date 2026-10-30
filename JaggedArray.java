public class JaggedArray 
{
    public static void main(String[] args) 
    {
        int[][] A;
        A = new int[3][];
        A[0] = new int[5];
        A[1] = new int[4];
        A[2] = new int[2];

        A[0] = new int[]{1, 2, 3, 4, 5, 6, 7, 8};

        for(int i = 0; i < A.length; i++)
        {
            for(int j = 0; j < A[i].length; j++)
            {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
        
    }
    
}
