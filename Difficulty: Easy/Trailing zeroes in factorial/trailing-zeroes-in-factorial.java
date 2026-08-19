class Solution {
    public static int trailingZeroes(int n) {
        // code here
        int count=0;
        while(n>=5)
        {
            n=n/5;
            count =count + n;
        }
        return count;
    }
}