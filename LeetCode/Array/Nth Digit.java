class Solution {

    public int findNthDigit(int n) {

        // current digit length
        long digits = 1;

        // how many numbers in current group
        long count = 9;

        // starting number of current group
        long start = 1;

        // STEP 1: Find correct digit-length group
        while (n > digits * count) {

            // remove current group digits
            n -= digits * count;

            // move to next digit group
            digits++;

            count *= 10;

            start *= 10;
        }

        // STEP 2: Find actual number
        long number =
                start + (n - 1) / digits;

        // STEP 3: Find digit index inside number
        int digitIndex =
                (int)((n - 1) % digits);

        // STEP 4: Convert number to string
        String s = String.valueOf(number);

        // STEP 5: Return required digit
        return s.charAt(digitIndex) - '0';
    }
}
