class Solution {
    public int minimizedMaximum(int n, int[] quantities) {
        int left = 1;
        int right = 0;

        for (int q : quantities) {
            right = Math.max(right, q);

        }

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (isFeasiable(quantities, n, mid)) {
                right = mid;

            } else {
                left = mid + 1;

            }

        }

        return left;

    }

    boolean isFeasiable(int[] quantities, int n, int mid) {
        int storeNeed = 0;

        for (int q : quantities) {
            storeNeed += (q + mid - 1) / mid;

        }

        return storeNeed <= n;

    }
}
