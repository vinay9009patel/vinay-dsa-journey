import java.util.Scanner;

public class DieRoll {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int max = Math.max(a, b);

        // max se 6 tak kitne numbers hain
        int count = 7 - max;

        // Fraction simplify karna
        if (count == 1 || count == 5) {
            System.out.println(count + "/6");
        }
        else if (count == 2 || count == 4) {
            System.out.println((count / 2) + "/3");
        }
        else if (count == 3) {
            System.out.println("1/2");
        }
        else {
            System.out.println("1/1");
        }
    }
}