import java.util.Scanner;

public class DubStep {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int i = 0;

        StringBuilder sb = new StringBuilder();

        while (i < s.length()) {

            
            if (i + 2 < s.length()
                    && s.charAt(i) == 'W'
                    && s.charAt(i + 1) == 'U'
                    && s.charAt(i + 2) == 'B') {

                
                if (sb.length() > 0 && sb.charAt(sb.length() - 1) != ' ') {
                    sb.append(" ");
                }

                i += 3;

            } else {

                sb.append(s.charAt(i));
                i++;
            }
        }

        System.out.println(sb);
    }
}