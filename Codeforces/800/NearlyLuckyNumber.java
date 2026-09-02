import java.util.Scanner;

public class NearlyLuckyNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

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

        if (count == 4 || count == 7) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}