import java.util.HashSet;
import java.util.Scanner;

public class IWannaBetheGuy {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        HashSet<Integer> set = new HashSet<>();

        int p = sc.nextInt();

        for (int i = 0; i < p; i++) {

            int level = sc.nextInt();
            set.add(level);
        }

        int q = sc.nextInt();

        for (int i = 0; i < q; i++) {

            int level = sc.nextInt();
            set.add(level);
        }

        if (set.size() == n) {
            System.out.println("I become the guy.");
        } else {
            System.out.println("Oh, my keyboard!");
        }
    }
}