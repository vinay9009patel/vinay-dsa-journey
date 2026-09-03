import java.util.Scanner;

public class Presents {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] p = new int[n + 1];

        for (int i = 1; i <= n; i++) {

            int person = sc.nextInt();

            p[person] = i;
        }

        for (int i = 1; i <= n; i++) {

            System.out.print(p[i] + " ");
        }
    }
}