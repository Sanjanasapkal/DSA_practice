class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int sum=0,Num=n,digit;
        
        while(n!=0)
        {
            digit=n%10;
            sum=sum+(digit*digit*digit);
            n=n/10;
        }
        if(Num==sum)
        {
            return true;
        }
        return false;
    }
}