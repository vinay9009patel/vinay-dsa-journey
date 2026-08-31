import java.util.*;

public class SoldierandBananas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long k = sc.nextLong();
        long n = sc.nextLong();
        long w = sc.nextLong();

        long total = k * w * (w + 1) / 2;
        long need = total - n;

        if (need < 0) {
            need = 0;
        }

        System.out.println(need);
    }
}

