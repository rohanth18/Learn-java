public class TwoDArray 
{
    //function to print 2D int array
    static void print2DArray(int[][] array)
    {
        for(int row = 0; row < array.length; row++)
        {
            for(int column = 0; column < array[row].length; column++)
            {
                System.out.print(array[row][column]+" ");
            }
            System.out.println();
        }
    }

    static void printRow(int[][] array, int rowNumber)
    {
        if(array == null || array.length == 0)
        {
            System.out.println("Null or empty array");
            return;
        }
        if(rowNumber > array.length || rowNumber < 1)
        {
            System.out.println("entered row is not existed in array");
            return;
        }
        int row = rowNumber - 1;        
        for(int column = 0; column < array[row].length; column++)
        {
            System.out.print(array[row][column]+" ");
        }
    }
    static void printColumn(int[][] array, int colNumber)
    {
        if(array == null || array.length == 0)
        {
            System.out.println("Null or empty array");
            return;
        }
        if(colNumber < 1 || colNumber > array.length)
        {
            System.out.println("entered column is not existed in array");
            return;
        }
        int column = colNumber - 1;
        for(int row = 0; row < array.length; row++)
        {
            if(array[row].length < colNumber)
            {
                System.out.println();
                continue;
            }
            else
            {
                System.out.println(array[row][column]);
            }
        }
    }
    static void printDiagonalElementsLeftToRight(int[][] array)
    {
        if(array == null || array.length == 0)
        {
            System.out.println("Null or empty array");
            return;
        }
        for(int row = 0; row < array.length; row++)
        {
            for(int column = 0; column < array[row].length; column++)
            {
                if(row == column)
                {
                    System.out.print(array[row][column]+"  ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    static void printDiagonalElementsRightToLeft(int[][] array)
    {
        if(array == null || array.length == 0)
        {
            System.out.println("Null or empty array");
            return;
        }
        
        for(int row = 0; row < array.length; row++)
        {
            for(int column = 0; column < array[row].length ; column++)
            {
                /* if(diff != (column - row))
                
                else
                {
                    System.out.print(array[row][column]+"  ");
                } */
                if (row + column == array.length - 1) {
                System.out.print(array[row][column] + "  ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            
            System.out.println();
        }
    }
    static void printDiagonalElementsfromBothSides(int[][] array)
    {
        if(array == null || array.length == 0)
        {
            System.out.println("Null or empty array");
            return;
        }
        for(int row = 0; row < array.length; row++)
        {
            for(int column = 0; column < array[row].length ; column++)
            {
                if(row == column || array.length-1 == (row + column))
                {
                    System.out.print(array[row][column]);
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    static void printDiagonalElementsV2(int[][] array)
    {
        if(array == null || array.length == 0)
        {
            System.out.println("Null or empty array");
            return;
        }
        
        int col = 0;
        for(int row = 0; row < array.length; row++)
        {
            if(col >= array[row].length)
            {
                break;
            }
            if(row == col)
            {
                System.out.println(array[row][col]);
            } 
            col++;
        }
    }
    public static void main(String[] args) 
    {
        int[][] array = {
                            {11,12,13,14,15},
                            {21,22,23,24,25},
                            {31,32,33,34,35},
                            {41,42,43,44,45},
                            {51,52,53,54,55}
                        };
        //int[][] array =  null;
        //print2DArray(array);
        //printRow(array, 0);
        //printColumn(array, 5);
        //printDiagonalElements(array);
        //printDiagonalElementsV2(array);
        //printDiagonalElementsRightToLeft(array);
        printDiagonalElementsfromBothSides(array);

    }
    
}
