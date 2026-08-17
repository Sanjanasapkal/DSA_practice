/*class Solution {
    public static int gcd(int a, int b) {
        // code here
        int c=(a<b)?a:b;
        for(int i=c;i>=2;i--)
        {
            if(a%i==0 && b%i==0)
            {
                return i;
            }
        }
        return 1;
    }
}*/
class Solution {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}