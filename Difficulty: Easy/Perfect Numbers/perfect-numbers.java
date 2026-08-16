

class Solution {
    static boolean isPerfect(int n) {
        if (n <= 1) {
            return false;
        }

        int sum = 1;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                sum += i;

                // If i and n/i are different, add both
                if (i != n / i) {
                    sum += n / i;
                }

                // No need to continue if sum already exceeds n
                if (sum > n) {
                    return false;
                }
            }
        }

        return sum == n;
    }
}/*class Solution {
    static boolean isPerfect(int n) {
        // code here
        int sum=1;
        int half=n/2;
        for(int i=2;i<=half;i++)
        {
            if(n%i==0)
            {
                sum=sum+i;
                if(sum>n)
                {
                    return false;
                }
            }
        }
        if(sum==n)
        {
            return true;
        }
        return false;
    }
};*/