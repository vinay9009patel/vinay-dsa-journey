import java.util.Scanner;

public class ArrivaloftheGeneral {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        int maxI = 0;
        int minI = 0;

        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();

            if (arr[i] > max) {
                max = arr[i];
                maxI = i;
            }

            if (arr[i] <= min) {
                min = arr[i];
                minI = i;
            }
        }

        int swap;

        if (minI < maxI) {
            swap = maxI + (n - 1 - minI) - 1;
        } else {
            swap = maxI + (n - 1 - minI);
        }

        System.out.println(swap);
    }
}