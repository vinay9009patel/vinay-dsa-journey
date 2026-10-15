
import java.util.*;

class Solution {

    int[] dp;

    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {

        int[][] arr = new int[startTime.length][3];

        dp = new int[startTime.length + 1];

        for (int i = 0; i < arr.length; i++) {

            arr[i][0] = startTime[i];
            arr[i][1] = endTime[i];
            arr[i][2] = profit[i];
        }

        Arrays.sort(arr, (a, b) -> a[0] - b[0]);

        Arrays.fill(dp, -1);

        return solve(dp, arr, 0);
    }

    public int solve(int[] dp, int[][] arr, int i) {

        if (i >= arr.length) {
            return 0;
        }

        if (dp[i] != -1) {
            return dp[i];
        }

        // Not Taken
        int notTaken = solve(dp, arr, i + 1);

        // Find next compatible job
        int find = find(arr, i);

        // Taken
        int taken = arr[i][2] + solve(dp, arr, find);

        return dp[i] = Math.max(taken, notTaken);
    }

    public int find(int[][] arr, int i) {

        int start = i + 1;
        int end = arr.length - 1;

        int target = arr[i][1];

        int ans = arr.length;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid][0] >= target) {

                ans = mid;
                end = mid - 1;

            } else {

                start = mid + 1;
            }
        }

        return ans;
    }
}
