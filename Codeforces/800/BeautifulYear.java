import java.util.HashSet;
import java.util.Scanner;

public class BeautifulYear{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int y = sc.nextInt();

        int newY = y + 1;

        while (true) {

            if (diff(newY)) {
                System.out.println(newY);
                break;
            }

            newY++;
        }
    }

    public static boolean diff(int newY) {

        HashSet<Integer> set = new HashSet<>();

        while (newY > 0) {

            int digit = newY % 10;

            if (set.contains(digit)) {
                return false;
            }

            set.add(digit);

            newY = newY / 10;
        }

        return true;
    }
}