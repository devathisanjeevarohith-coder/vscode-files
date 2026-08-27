import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        // Fix: Use [][] for 2D arrays
        int[][] matrix1 = new int[3][3];
        int[][] matrix2 = new int[3][3];
        int[][] sum = new int[3][3];
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter elements of Matrix 1:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix1[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nEnter elements of Matrix 2:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix2[i][j] = sc.nextInt();
            }
        }

        // Logic: Adding corresponding elements
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        System.out.println("\nSum of matrices is:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                // Using \t (tab) helps keep the columns aligned
                System.out.print(sum[i][j] + "\t");
            }
            System.out.println(); // Moves to next line after each row
        }
        
        sc.close();
    }
}