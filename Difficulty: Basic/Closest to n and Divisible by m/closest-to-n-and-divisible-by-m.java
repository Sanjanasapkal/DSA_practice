class Solution {
    static int closestNumber(int n, int m) {
        int rem = n % m;

        int lower = n - rem;
        int upper;

        if (n >= 0) {
            upper = lower + Math.abs(m);
        } else {
            upper = lower - Math.abs(m);
        }

        int diff1 = Math.abs(n - lower);
        int diff2 = Math.abs(n - upper);

        if (diff1 < diff2) {
            return lower;
        } else if (diff2 < diff1) {
            return upper;
        } else {
            return Math.abs(lower) > Math.abs(upper) ? lower : upper;
        }
    }
}