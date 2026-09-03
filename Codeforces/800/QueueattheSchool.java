import java.util.Scanner;

public class QueueattheSchool {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int t = sc.nextInt();

        char[] arr = sc.next().toCharArray();

        for (int second = 0; second < t; second++) {

            for (int i = 0; i < n - 1; i++) {

                if (arr[i] == 'B' && arr[i + 1] == 'G') {

                    arr[i] = 'G';
                    arr[i + 1] = 'B';

                    i++;
                }
            }
        }

        System.out.println(new String(arr));
    }
}