import java.util.*;

public class Translation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String r = sc.nextLine();

        if (s.length() != r.length()) {
            System.out.println("NO");
            return;
        }

        boolean same = true;

        int j = r.length() - 1;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) != r.charAt(j)) {
                same = false;
                break;
            }

            j--;
        }

        if (same) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}