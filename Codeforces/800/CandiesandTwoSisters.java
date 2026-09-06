import java.util.Scanner;

public class CandiesandTwoSisters {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();

            int answer;

            if (n % 2 == 0) {

                answer = (n - 2) / 2;

            } else {

                answer = (n - 1) / 2;
            }

            System.out.println(answer);
        }
    }
}