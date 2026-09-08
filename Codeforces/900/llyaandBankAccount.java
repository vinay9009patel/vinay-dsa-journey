import java.util.Scanner;

public class llyaandBankAccount {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        if (n < 0) {

            long option1 = n / 10;

            long option2 = (n / 100) * 10 + (n % 10);

            System.out.println(Math.max(option1, option2));

        } else {

            System.out.println(n);
        }
    }
}