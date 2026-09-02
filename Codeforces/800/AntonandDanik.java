import java.util.Scanner;

public class AntonandDanik {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next();

        int countA = 0;
        int countD = 0;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch == 'A') {
                countA++;
            } else {
                countD++;
            }
        }

        if (countA == countD) {
            System.out.println("Friendship");
        }
        else if (countA > countD) {
            System.out.println("Anton");
        }
        else {
            System.out.println("Danik");
        }
    }
}