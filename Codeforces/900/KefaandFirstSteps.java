import java.util.*;

public class KefaandFirstSteps {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];

        int max = Integer.MIN_VALUE;
        int prev = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();

            if (i == 0) {
                count = 1;
            }
            else if (prev <= arr[i]) {
                count++;
            }
            else {
                count = 1;
            }

            if (count > max) {
                max = count;
            }

            prev = arr[i];
        }

        System.out.println(max);
    }
}