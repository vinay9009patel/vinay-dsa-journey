import java.util.*;

public class BeautifulMatrix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int m = 5;
        int n = 5;

        int matrix[][] = new int[m][n];

        int ans = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                matrix[i][j] = sc.nextInt();

                if (matrix[i][j] == 1) {
                    ans = Math.abs(2 - i) + Math.abs(2 - j);
                }
            }
        }

        System.out.println(ans);
    }
}