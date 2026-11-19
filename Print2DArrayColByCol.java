/* public class Print2DArrayColByCol {
    public static void main(String[] args) {

        int[][] array = {{1,2,3},{1,2}};

        int maxCols = 0;

        for(int i = 0; i < array.length; i++) {
            if(array[i].length > maxCols) {
                maxCols = array[i].length;
            }
        }

        for(int i = 0; i < maxCols; i++) {

            for(int j = 0; j < array.length; j++) {

                if(i < array[j].length) {
                    System.out.print(array[j][i] + " ");
                }
            }

            System.out.println();
        }
    }
} */

public class Print2DArrayColByCol {
    public static void main(String[] args) {

        int[][] array = {{1,2,3}, {1,2}};

        int col = 0;

        while (true) {
            boolean found = false;

            for (int i = 0; i < array.length; i++) {

                if (col < array[i].length) {
                    System.out.print(array[i][col] + " ");
                    found = true;
                }
            }

            if (!found) {
                break;
            }

            System.out.println();
            col++;
        }
    }
}