import java.util.*;

public class Chatroom {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        char[] arr = {'h', 'e', 'l', 'l', 'o'};

        int j = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == arr[j]) {
                j++;
            }

            if (j == arr.length) {
                break;
            }
        }

        if (j == arr.length) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}