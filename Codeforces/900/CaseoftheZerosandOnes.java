import java.util.Scanner;

public class CaseoftheZerosandOnes {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next();

        int counto = 0;
        int countz = 0;

        for (int i = 0; i < n; i++) {

            char ch = s.charAt(i);

            if (ch == '0') {
                countz++;
            } else {
                counto++;
            }
        }

        System.out.println(n - 2 * Math.min(counto, countz));
    }
}