import java.util.Scanner;

public class Keyboard {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String keyboard = "qwertyuiopasdfghjkl;zxcvbnm,./";

        String direction = sc.next();
        String s = sc.next();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            int idx = keyboard.indexOf(s.charAt(i));

            if (direction.equals("L")) {

                sb.append(keyboard.charAt(idx + 1));

            } else {

                sb.append(keyboard.charAt(idx - 1));
            }
        }

        System.out.println(sb);
    }
}