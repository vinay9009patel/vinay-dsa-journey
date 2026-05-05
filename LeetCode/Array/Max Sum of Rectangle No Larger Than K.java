class Solution {
    public int maxSumSubmatrix(int[][] matrix, int k) {

        int row = matrix.length, col = matrix[0].length;
        int MaxSum = Integer.MIN_VALUE;

        for (int left = 0; left < col; left++) {

            int[] rowMatrix = new int[row]; // reset

            for (int right = left; right < col; right++) {

                for (int i = 0; i < row; i++) { // correct loop
                    rowMatrix[i] += matrix[i][right];
                }

                MaxSum = Math.max(MaxSum, CurrentMaxSum(rowMatrix, k));
            }
        }
        return MaxSum;
    }

    int CurrentMaxSum(int[] row, int k) {

        TreeSet<Integer> set = new TreeSet<>();
        set.add(0);

        int currSum = 0, MaxSum = Integer.MIN_VALUE;

        for (int i = 0; i < row.length; i++) {

            currSum += row[i];

            Integer prefixSum = set.ceiling(currSum - k);

            if (prefixSum != null) {
                MaxSum = Math.max(MaxSum, currSum - prefixSum);
            }

            set.add(currSum);
        }

        return MaxSum;
    }
}
