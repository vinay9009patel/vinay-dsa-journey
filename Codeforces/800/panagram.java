import java.util.Scanner;

public class panagram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        String s = sc.nextLine().toLowerCase();

        if (n < 26) {
            System.out.println("NO");
            return;
        }

        boolean[] store = new boolean[26];

        for (int i = 0; i < s.length(); i++) {

            int idx = s.charAt(i) - 'a';

            store[idx] = true;
        }

        for (int i = 0; i < 26; i++) {

            if (store[i] == false) {
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES");
    }
}