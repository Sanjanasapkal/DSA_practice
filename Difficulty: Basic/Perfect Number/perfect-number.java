class Solution {
    int fact(int num)
    {
        int ft=1;
        while(num!=0)
        {
            ft=ft*num;
            num--;
        }
        return ft;
    }
    int isPerfect(int N) {
        // code here
        int num=N,sum=0,digit;
        while(num!=0)
        {
            digit=num%10;
            sum=sum+fact(digit);
            num=num/10;
        }
        if(N==sum)
        return 1;
        
        return 0;
    }
}