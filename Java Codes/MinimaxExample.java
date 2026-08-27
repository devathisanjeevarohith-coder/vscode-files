import java.util.Scanner;

public class MinimaxExample {

    // Simple recursive minimax function
    public static int minimax(int depth, int nodeIndex, boolean isMax, int[] scores, int h) {
        // Base case: leaf node reached
        if (depth == h) {
            return scores[nodeIndex];
        }

        if (isMax) {
            int left = minimax(depth + 1, nodeIndex * 2, false, scores, h);
            int right = minimax(depth + 1, nodeIndex * 2 + 1, false, scores, h);
            return Math.max(left, right);
        } else {
            int left = minimax(depth + 1, nodeIndex * 2, true, scores, h);
            int right = minimax(depth + 1, nodeIndex * 2 + 1, true, scores, h);
            return Math.min(left, right);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Simple array of leaf values
        int[] scores = {3, 5, 2, 9, 12, 5, 23, 23};
        int treeHeight = 3; // Height of tree with 8 leaves (2^3 = 8)

        System.out.println("=== SIMPLE MINIMAX EXAMPLE ===");
        System.out.print("Leaf values in array: ");
        for (int val : scores) {
            System.out.print(val + " ");
        }
        System.out.println("\n");

        System.out.print("Enter starting turn (1 for Maximizer, 0 for Minimizer): ");
        int choice = scanner.nextInt();
        boolean isMax = (choice == 1);

        int result = minimax(0, 0, isMax, scores, treeHeight);

        System.out.println("\nThe optimal value computed by Minimax is: " + result);

        scanner.close();
    }
}

