class Solution {

    public int kthSmallest(int[][] matrix, int k) {

        int n = matrix.length;

        PriorityQueue<int[]> pq =
                new PriorityQueue<>(
                        (a, b) -> a[0] - b[0]
                );

        for (int row = 0; row < n; row++) {

            pq.offer(
                    new int[]{
                            matrix[row][0],
                            row,
                            0
                    }
            );
        }

        int ans = 0;

        for (int i = 0; i < k; i++) {

            int[] curr = pq.poll();

            ans = curr[0];

            int row = curr[1];
            int col = curr[2];

            if (col + 1 < n) {

                pq.offer(
                        new int[]{
                                matrix[row][col + 1],
                                row,
                                col + 1
                        }
                );
            }
        }

        return ans;
    }
}
