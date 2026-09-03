import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        String zero = "0000000";
        String one = "1111111";

        if (s.contains(zero) || s.contains(one)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
