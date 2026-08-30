import java.util.*;

public class  TheatreSquare{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long m = sc.nextLong();
        long a = sc.nextLong();

        long row, col;

        if (n % a == 0) {
            row = n / a;
        } else {
            row = n / a + 1;
        }

        if (m % a == 0) {
            col = m / a;
        } else {
            col = m / a + 1;
        }

        System.out.println(row * col);
    }
}
