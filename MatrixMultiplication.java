public class MatrixMultiplication 
{
    static int[][] multiplicationOf2Matrices(int[][] A, int[][] B)
    {
        if(A == null || B == null)
        {
            return new int[][] {};
        }

        if(A[0].length != B.length)
        {
            return new int[][] {};
        }

        int[][] result = new int[A.length][B[0].length];

        for(int i = 0; i < A.length; i++)
        {
            for(int j = 0; j < B[i].length; j++)
            {
                for(int k = 0; k < A[i].length; k++)
                {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return result;
    }
    public static void main(String[] args) 
    {
        int[][] A = {{3,5,9},{7,6,2},{4,8,1}};
        int[][] B = {{1,0,0},{0,1,0},{0,0,1}};
        
        int[][] result = multiplicationOf2Matrices(A,B);
        for(int i = 0; i < result.length; i++)
        {
            for(int j = 0; j < result[i].length; j++)
            {
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }

    }
    
}
