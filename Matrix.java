/**
 * Created by Tatiana_Petukhova on 9/21/2015.
 */
import java.lang.Math;

public class Matrix {

    public static void main(String[] args) {

        int rows = 10;
        int columns = 20;

        int[][] matrix = new int[rows][columns];
        int a = Math.min(rows, columns);

        for (int i = 0; i < a; i++) {
            matrix[i][i] = 1;
            matrix[i][a - i -1] = 1;
        }

        for (int i =0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}