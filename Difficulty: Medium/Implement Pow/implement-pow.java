class Solution {
    double power(double b, int e) {
        long exp = e;
        double result = 1.0;

        if (exp < 0) {
            b = 1.0 / b;
            exp = -exp;
        }

        while (exp > 0) {
            if (exp % 2 == 1) {
                result *= b;
            }

            b *= b;
            exp /= 2;
        }

        return result;
    }
}