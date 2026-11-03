public class TwoDArrayDay3 
{
    //Sum of elements in 2D array
    static int getSumOF2DArrayEle(int[][] array)
    {
        if(array == null || array.length == 0)
        {
            return 0;
        }
        int sum = 0;
        for(int row = 0; row < array.length; row++)
        {
            for(int col = 0; col < array[row].length; col++)
            {
                sum += array[row][col];
            }
        }
        return sum;
    }

    //Finding the maximum element in 2D array
    static int getMaximum2DArrayElement(int[][] array)
    {
        int max = array[0][0];
        for(int i = 0; i < array.length; i++)
        {
            for(int j = 0; j < array[i].length; j++)
            {
                if(array[i][j] > max)
                {
                    max = array[i][j];
                }
            }
        }
        return max;
    }

    //Finding the minimum element in 2D array
    static int getMinimum2DArrayElement(int[][] array)
    {
        int min = array[0][0];
        for(int i = 0; i < array.length; i++)
        {
            for(int j = 0; j < array[i].length; j++)
            {
                if(array[i][j] < min)
                {
                    min = array[i][j];
                }
            }
        }
        return min;
    }

    //Counting even and odd elements count in 2D array
    static int[] getEvenAndOddCount(int[][] array)
    {
        if(array == null || array.length == 0)
        {
            return new int[] {};
        }
        
        int evenCount = 0;
        int oddCount = 0;
        for(int i = 0; i < array.length; i++)
        {
            for(int j = 0; j < array[i].length; j++)
            {
                if(array[i][j] % 2 == 0)
                {
                    evenCount++;
                }
                else
                {
                    oddCount++;
                }
            }
        }
        return new int[]{evenCount, oddCount};
    }

    //Search for the key element in 2D array
    static boolean isKeyElementFound(int[][] array, int key)
    {
        if(array == null || array.length == 0)
        {
            return false;
        }
        boolean found = false;
        for(int i = 0; i < array.length; i++)
        {
            for(int j = 0; j < array[i].length; j++)
            {
                if(array[i][j] == key)
                {
                    found = true;
                    break;
                }
            }
        }
        return found;
    }

    //Scalar multiplication of 2D array
    static int[][] getScalarMultipliedArray(int[][] array, int scalar)
    {
        if(array == null || array.length == 0)
        {
            return null;
        }

        int result[][] = new int[array.length][array[0].length];
        for(int i = 0; i < array.length; i++)
        {
            for(int j = 0; j < array[i].length; j++)
            {
                result[i][j] = array[i][j] * scalar;
            }
        }
        return result;
    }

    //Sum of Even elements in 2D array
    static int getEvenElementsSum(int[][] array)
    {
        if(array == null || array.length == 0)
        {
            return 0;
        }

        int sum = 0;
        for(int i = 0; i < array.length; i++)
        {
            for(int j = 0; j < array[i].length; j++)
            {
                if(array[i][j] % 2 == 0)
                {
                    sum += array[i][j];
                }
            }
        }
        return sum;
    }

    //Finding sum of each row
    static int[][] getSumOfEachRow(int[][] array)
    {
        if(array == null || array.length == 0)
        {
            return null;
        }
        int[][] rowSum = new int[array.length][1];
        for(int i = 0; i < array.length; i++)
        {
            for(int j = 0; j < array[i].length; j++)
            {
                rowSum[i][0] = rowSum[i][0] + array[i][j];
            }
        }
        return rowSum;
    }

    //Finding sum of each column
    static int[] getColumnSum(int[][] array)
    {
        if(array == null || array.length == 0)
        {
            return null;
        }

        int[] colSum = new int[array[0].length];
        
        for(int i = 0; i < array.length; i++)
        {
            for(int j = 0; j < array[i].length; j++)
            {
                colSum[i] += array[j][i];
            }
        }
        return colSum;
    }

    //Finding sum of elements greater than 50 in 2D array
    static int getSumOfElementsGreaterThan50(int[][] array)
    {
        if(array == null || array.length == 0)
        {
            return 0;
        }

        int sum = 0;
        for(int i = 0; i < array.length; i++)
        {
            for(int j = 0; j < array[i].length; j++)
            {
                if(array[i][j] > 50)
                {
                    sum += array[i][j];
                }
            }
        }
        return sum;
    }

    //Finding maximum element in each row of 2D array
    static int[] getMaxElementInEachRow(int[][] array)
    {
        if(array == null || array.length == 0)
        {
            return null;
        }

        int[] rowMax = new int[array.length];
        for(int i = 0; i < array.length; i++)
        {
            int max = array[i][0];
            for(int j = 0; j < array[i].length; j++)
            {
                if(array[i][j] > max)
                {
                    max = array[i][j];
                }
            }
            rowMax[i] = max;
        }
        return rowMax;
    }

    //Finding minimum even element in 2D array
    static int getMinimumEvenElement(int[][] array)
    {
        if(array == null || array.length == 0)
        {
            return -1;
        }
        int evenMin = Integer.MAX_VALUE;
        for(int i = 0; i < array.length; i++)
        {
            for(int j = 0; j < array[i].length; j++)
            {
                if(array[i][j] % 2 == 0 && array[i][j] < evenMin)
                {
                    evenMin = array[i][j];
                }
            }
        }
        return evenMin;
    }

    //Multiply matrix by -1
    static int[][] multiply2DArrayByMinus1(int[][] array)
    {
        if(array == null || array.length == 0)
        {
            return null;
        }
        int[][] result = new int[array.length][array[0].length];
        for(int i = 0; i < array.length; i++)
        {
            for(int j = 0; j < array[i].length; j++)
            {
                result[i][j] = array[i][j] * -1;
            }
        }
        return result;
    }

    //Multiply diagonal elements by 10
    static int[][] multiplyDiagonalElementsBy10(int[][] array)
    {
        if(array == null || array.length == 0)
        {
            return null;
        }

        int[][] result = new int[array.length][array[0].length];
        for(int i = 0; i < array.length; i++)
        {
            for(int j = 0; j < array[i].length; j++)
            {
                if(i == j)
                {
                    result[i][j] = array[i][j] * 10;
                }
                else
                {
                    result[i][j] = array[i][j];
                }
            }
        }
        return result;
    }

    //Count number of times a key element exists
    static int getCountOfKeyElement(int[][] array, int key)
    {
        if(array == null || array.length == 0)
        {
            return -1;
        }

        int count = 0;
        for(int i = 0; i < array.length; i++)
        {
            for(int j = 0; j < array[i].length; j++)
            {
                if(array[i][j] == key)
                {
                    count++;
                }
            }
        }
        return count;
    }

    //Search element in main diagonal
    static boolean isElementPresentInDiagonal(int[][] array, int key)
    {
        if(array == null || array.length == 0)
        {
            return false;
        }

        boolean found = false;
        for(int i = 0; i < array.length; i++)
        {
            if(array[i][i] == key)
            {
                found = true;
                break;
            }
        }
        return found;
    }
    public static void main(String[] args) 
    {
        int[][] array = {{3,5,9},{7,6,2},{4,8,1}};
        //int[][] array = {{3,54,9},{70,60,2},{4,80,1}};
        //Sum of elements in 2D array
        //System.out.println("Sum = "+getSumOF2DArrayEle(array));

        //Finding the maximum element in 2D array
        /* int maxresult = getMaximum2DArrayElement(array);
        System.out.println("Maximum element = "+maxresult);
 */

        //Finding the minimum element in 2D array
        /* int minresult = getMinimum2DArrayElement(array);
        System.out.println(minresult); */

        //Counting even and odd elements count in 2D array
        /* int[] result = getEvenAndOddCount(array);
        System.out.println("Even Count = "+result[0]+" Odd Count = "+result[1]);
 */
        //Search for the key element in 2D array
        /* boolean result1 = isKeyElementFound(array, 8);
        if(result1 == true)
        {
            System.out.println("Element found");
        }
        else
        {
            System.out.println("Element not found");
        } */

        //Scalar multiplication of 2D array
        /* int[][] resultMatrix = getScalarMultipliedArray(array, 2);
        if(resultMatrix == null)
        {
            System.out.println("Null array or empty array");
        }
        else
        {
            for(int i = 0; i < resultMatrix.length; i++)
            {
                for(int j = 0; j < resultMatrix[i].length; j++)
                {
                    System.out.print(resultMatrix[i][j]+"  ");
                }
                System.out.println();
            }
        } */

        //Sum of Even elements in 2D array
        /* int sum = getEvenElementsSum(array);
        System.out.println("Sum = "+sum); */

        //Finding sum of each row
        /* int[][] result = getSumOfEachRow(array);
        if(result == null)
        {
            System.out.println("Null or empty array");
        }
        else
        {
            int j = 0;
            for(int i = 0; i < result.length; i++)
            {
                System.out.println(result[i][j]);
            }
        } */

        //Finding sum of each column
        /* int[] result = getColumnSum(array);
        if(result == null)
        {
            System.out.println("Empty or null array");
        }
        else
        {
            for(int i = 0; i < result.length; i++)
            {
                System.out.print(result[i]+" ");
            }
        } */

        //Finding sum of elements greater than 50
        /* int sum = getSumOfElementsGreaterThan50(array);
        System.out.println("Sum = "+sum); */

        //Finding maximum element in each row
        /* int[] result = getMaxElementInEachRow(array);
        if(result == null)
        {
            System.out.println("Null or empty array");
        }
        else
        {
            for(int i = 0; i < result.length; i++)
            {
                System.out.println(result[i]);
            }
        } */

        //Finding minimum even element in 2D array
        /* int result = getMinimumEvenElement(array);
        if(result == -1)
        {
            System.out.println("Array is null or empty");
        }
        if(result == Integer.MAX_VALUE)
        {
            System.out.println("No even values are existed");
        }
        else
        {
            System.out.println("Min Even value = "+result);
        } */

        //Multiply matrix by -1
        /* int[][] result = multiply2DArrayByMinus1(array);
        if(result == null)
        {
            System.out.println("Null or empty array");
        }
        else
        {
            for(int i = 0; i < result.length; i++)
            {
                for(int j = 0; j < result[i].length; j++)
                {
                    System.out.print(result[i][j] + " ");
                }
                System.out.println();
            }
        } */

        //Multiply main diagonal elements by 10
        /* int[][] result = multiplyDiagonalElementsBy10(array);
        if(result == null)
        {
            System.out.println("Null or empty array");
        }
        else
        {
            for(int i = 0; i < result.length; i++)
            {
                for(int j = 0; j < result[i].length; j++)
                {
                    System.out.print(result[i][j] + " ");
                }
                System.out.println();
            }
        } */

        //Count number of times a key element exists
        /* int[][] array = {{3,5,9},{5,5,2},{5,8,1}};
        int result = getCountOfKeyElement(array, 5);
        if(result == -1)
        {
            System.out.println("Null or empty array");
        }
        else
        {
            System.out.println(result);
        } */

        //Search element in main diagonal
        boolean result = isElementPresentInDiagonal(array, 1);
        if(result == true)
        {
            System.out.println("Element present in diagonal");
        }
        else
        {
            System.out.println("Element is not present in diagonal");
        }
    }
}
