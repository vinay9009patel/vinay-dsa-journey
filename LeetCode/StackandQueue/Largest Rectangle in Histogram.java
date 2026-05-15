class Solution {

    public int largestRectangleArea(int[] heights) {

        int left[] = stLeft(heights);

        int right[] = stRight(heights);

        int maxArea = 0;

        for (int i = 0;
             i < heights.length;
             i++) {

            int area =
                    (right[i] - left[i] - 1)
                    * heights[i];

            maxArea =
                    Math.max(maxArea, area);
        }

        return maxArea;
    }

    int[] stLeft(int arr[]) {

        int left[] = new int[arr.length];

        Deque<Integer> dq =
                new ArrayDeque<>();

        for (int i = 0;
             i < arr.length;
             i++) {

            while (!dq.isEmpty() &&
                    arr[dq.peek()] >= arr[i]) {

                dq.pop();
            }

            if (dq.isEmpty()) {

                left[i] = -1;

            } else {

                left[i] = dq.peek();
            }

            dq.push(i);
        }

        return left;
    }

    int[] stRight(int arr[]) {

        int right[] = new int[arr.length];

        Deque<Integer> dq =
                new ArrayDeque<>();

        for (int i = arr.length - 1;
             i >= 0;
             i--) {

            while (!dq.isEmpty() &&
                    arr[dq.peek()] >= arr[i]) {

                dq.pop();
            }

            if (dq.isEmpty()) {

                right[i] = arr.length;

            } else {

                right[i] = dq.peek();
            }

            dq.push(i);
        }

        return right;
    }
}
