import java.util.*;

public class LightsOut {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[3][3];

        // Input
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Final matrix
        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                int count = arr[i][j];

                // up
                if (i > 0) {
                    count += arr[i - 1][j];
                }

                // down
                if (i < 2) {
                    count += arr[i + 1][j];
                }

                // left
                if (j > 0) {
                    count += arr[i][j - 1];
                }

                // right
                if (j < 2) {
                    count += arr[i][j + 1];
                }

                if (count % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }

            System.out.println();
        }
    }
}