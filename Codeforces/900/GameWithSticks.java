import java.util.*;

public class GameWithSticks {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        boolean A = true;

        while (n > 0 && m > 0) {

            n--;
            m--;

            
            if (n == 0 || m == 0) {

                if (A) {
                    System.out.println("Akshat");
                } else {
                    System.out.println("Malvika");
                }

                return;
            }

            A = !A;
        }
    }
}