import java.util.*;

public class tram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int nStop = sc.nextInt();

        int prevPeople = 0;
        int maxCap = 0;

        for (int i = 1; i <= nStop; i++) {

            int newExit = sc.nextInt();
            int newEnter = sc.nextInt();

            prevPeople = prevPeople - newExit + newEnter;

            maxCap = Math.max(maxCap, prevPeople);
        }

        System.out.println(maxCap);
    }
}