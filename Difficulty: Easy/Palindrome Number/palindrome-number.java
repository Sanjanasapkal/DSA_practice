class Solution {
    public boolean isPalindrome(int n) {
        // code here
        int num=0,digit;
        int temp=n;
        while(n!=0)
        {
            digit=n%10;
            num=(num*10)+digit;
            n=n/10;
        }
        if(num==temp)
        {
            return true;
        }
        return false;
    }
}