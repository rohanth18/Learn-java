public class TwoDArrayAddition 
{
    public static void main(String[] args) 
    {
        int[][] A = {{1,2,3},{4,5,6}};
        int[][] B = {{1,0,0},{0,1,0}};
        int[][] C = new int[A.length][A[0].length];
        for(int i = 0; i < A.length; i++)
        {
            for(int j = 0;j < A[i].length; j++)
            {
                C[i][j] = A[i][j]+B[i][j];
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }

        
    }
    
}
