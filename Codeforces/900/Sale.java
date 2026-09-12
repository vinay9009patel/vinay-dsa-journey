import java.util.*;

public class Sale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int ans = 0;

        for (int i = 0; i < m; i++) {
            if (arr[i] < 0) {
                ans += -arr[i];
            } else {
                break;
            }
        }

        System.out.println(ans);
    }
}