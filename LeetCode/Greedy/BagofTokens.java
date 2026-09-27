import java.util.*;

class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {

        Arrays.sort(tokens);

        int i = 0;
        int j = tokens.length - 1;

        int score = 0;
        int maxScore = 0;

        while (i <= j) {

            if (tokens[i] <= power) {
                power -= tokens[i];
                score++;
                i++;

                maxScore = Math.max(maxScore, score);
            }
            else if (score > 0) {
                power += tokens[j];
                score--;
                j--;
            }
            else {
                break;
            }
        }

        return maxScore;
    }
}
