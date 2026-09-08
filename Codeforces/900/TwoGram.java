import java.util.*;

public class TwoGram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String s = sc.next();

        int i = 0;
        int j = 2;

        int max = Integer.MIN_VALUE;

        HashMap<String, Integer> map = new HashMap<>();

        String ans = "";

        while (i < j && j <= s.length()) {

            String store = s.substring(i, j);

            if (map.containsKey(store)) {

                map.put(store, map.get(store) + 1);

            } else {

                map.put(store, 1);
            }

            if (max < map.get(store)) {

                max = map.get(store);
                ans = store;
            }

            i++;
            j++;
        }

        System.out.println(ans);
    }
}