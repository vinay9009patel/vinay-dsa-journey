import java.util.Scanner;

public class NearlyLuckyNext {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        int countfour = 0;
        int countseven = 0;

        while (n > 0) {

            if (n % 10 == 4) {
                countfour++;
            }
            else if (n % 10 == 7) {
                countseven++;
            }

            n = n / 10;
        }

        int count = countfour + countseven;

        boolean lucky = true;

        if (count == 0) {
            lucky = false;
        }

        while (count > 0) {

            int digit = count % 10;

            if (digit != 4 && digit != 7) {
                lucky = false;
                break;
            }

            count = count / 10;
        }

        if (lucky) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}