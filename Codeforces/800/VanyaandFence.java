import java.util.Scanner;

public class VanyaandFence {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int h = sc.nextInt();

        int count = 0;

        for (int i = 0; i < n; i++) {

            int height = sc.nextInt();

            if (height <= h) {
                count += 1;
            } else {
                count += 2;
            }
        }

        System.out.println(count);
    }
}