import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'queensAttack' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER k
     *  3. INTEGER r_q
     *  4. INTEGER c_q
     *  5. 2D_INTEGER_ARRAY obstacles
     */

    public static int queensAttack(int n, int k, int r_q, int c_q, List<List<Integer>> obstacles) {
    // Write your code here
     

    
    Set<String> set = new HashSet<>();

    for (List<Integer> obs : obstacles) {
        set.add(obs.get(0) + "," + obs.get(1));
    }

    int count = 0;

    // UP
    for (int i = r_q + 1; i <= n; i++) {
        if (set.contains(i + "," + c_q)) break;
        count++;
    }

    // DOWN
    for (int i = r_q - 1; i >= 1; i--) {
        if (set.contains(i + "," + c_q)) break;
        count++;
    }

    // RIGHT
    for (int j = c_q + 1; j <= n; j++) {
        if (set.contains(r_q + "," + j)) break;
        count++;
    }

    // LEFT
    for (int j = c_q - 1; j >= 1; j--) {
        if (set.contains(r_q + "," + j)) break;
        count++;
    }

    // UP-RIGHT
    for (int i = r_q + 1, j = c_q + 1; i <= n && j <= n; i++, j++) {
        if (set.contains(i + "," + j)) break;
        count++;
    }

    // UP-LEFT
    for (int i = r_q + 1, j = c_q - 1; i <= n && j >= 1; i++, j--) {
        if (set.contains(i + "," + j)) break;
        count++;
    }

    // DOWN-RIGHT
    for (int i = r_q - 1, j = c_q + 1; i >= 1 && j <= n; i--, j++) {
        if (set.contains(i + "," + j)) break;
        count++;
    }

    // DOWN-LEFT
    for (int i = r_q - 1, j = c_q - 1; i >= 1 && j >= 1; i--, j--) {
        if (set.contains(i + "," + j)) break;
        count++;
    }

    return count;
}
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int k = Integer.parseInt(firstMultipleInput[1]);

        String[] secondMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int r_q = Integer.parseInt(secondMultipleInput[0]);

        int c_q = Integer.parseInt(secondMultipleInput[1]);

        List<List<Integer>> obstacles = new ArrayList<>();

        IntStream.range(0, k).forEach(i -> {
            try {
                obstacles.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = Result.queensAttack(n, k, r_q, c_q, obstacles);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
