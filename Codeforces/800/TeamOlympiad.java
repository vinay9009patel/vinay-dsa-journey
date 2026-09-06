import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ArrayList<Integer> one = new ArrayList<>();
        ArrayList<Integer> two = new ArrayList<>();
        ArrayList<Integer> three = new ArrayList<>();

       
        for (int i = 1; i <= n; i++) {

            int skill = sc.nextInt();

            if (skill == 1) {
                one.add(i);
            }
            else if (skill == 2) {
                two.add(i);
            }
            else {
                three.add(i);
            }
        }

        int teams = Math.min(
            one.size(),
            Math.min(two.size(), three.size())
        );

        System.out.println(teams);

         
        for (int i = 0; i < teams; i++) {

            System.out.println(
                one.get(i) + " " +
                two.get(i) + " " +
                three.get(i)
            );
        }
    }
}