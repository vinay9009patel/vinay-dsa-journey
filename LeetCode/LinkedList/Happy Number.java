class Solution {

    public boolean isHappy(int n) {

        int slow = n;
        int fast = n;

        while (true) {

            // slow moves 1 step
            slow = squareSum(slow);

            // fast moves 2 steps
            fast = squareSum(squareSum(fast));

            // happy number
            if (fast == 1) {
                return true;
            }

            // cycle detected
            if (slow == fast) {
                return false;
            }
        }
    }

    // calculate sum of squares of digits
    int squareSum(int n) {

        int sum = 0;

        while (n > 0) {

            int digit = n % 10;

            sum += digit * digit;

            n = n / 10;
        }

        return sum;
    }
}
