class Solution {
    public static boolean isPowerofTwo(int n) {
        // code here
        if(n==1 || n==2)
        {
            return true;
        }
        if(n%2!=0)
        {
            return false;
        }
        else
        {
            int power=2;
            int i=2;
            while(power<=n)
            {
                power=power*i;
                if(power==n)
                {
                    return true;
                }
            }
        }
        return false;
    }
}