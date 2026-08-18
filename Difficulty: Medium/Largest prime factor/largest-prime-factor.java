class Solution {
    static int largestPrimeFactor(int n) {
        int max = 0;

        for (int i = 2; i * i <= n; i++) {
            while (n % i == 0) {
                max = i;
                n = n / i;
            }
        }
        if (n > 1) {
            max = n;
        }

        return max;
    }
}