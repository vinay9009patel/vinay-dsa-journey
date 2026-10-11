class Solution {
    public int nthUglyNumber(int n) {

        int t[] = new int[n + 1];

        int i2 = 1;
        int i3 = 1;
        int i5 = 1;

        t[1] = 1;

        for (int i = 2; i <= n; i++) {

            int i2No = t[i2] * 2;
            int i3No = t[i3] * 3;
            int i5No = t[i5] * 5;

            int mini = Math.min(i2No, Math.min(i3No, i5No));

            t[i] = mini;

            if (mini == i2No) i2++;
            if (mini == i3No) i3++;
            if (mini == i5No) i5++;
        }

        return t[n];
    }
}
