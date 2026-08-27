import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        // Dimensions: Matrix1 (2x3) * Matrix2 (3x1) = Product (2x1)
        int[][] matrix1 = new int[2][3];
        int[][] matrix2 = new int[3][1]; 
        int[][] product = new int[2][1];
        
        Scanner sc = new Scanner(System.in); // Fixed colon to semicolon
        
        System.out.println("Enter elements of Matrix 1 (2 rows, 3 columns):");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix1[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nEnter elements of Matrix 2 (3 rows, 1 column):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 1; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix2[i][j] = sc.nextInt();
            }
        }

        // Multiplication Logic: Row of A * Column of B
        for (int i = 0; i < 2; i++) { 
            for (int j = 0; j < 1; j++) { 
                for (int k = 0; k < 3; k++) { 
                    product[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        System.out.println("\nResultant Matrix:");
        for (int i = 0; i < 2; i++) {
            System.out.println("[" + product[i][0] + "]");
        }
    }
}