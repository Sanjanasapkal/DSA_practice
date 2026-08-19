class Solution {
    boolean isPalindrome(String s) {
        // code here
        int last=s.length();
        int m=last/2;
        for(int i=0;i<=m;i++)
        {
            last--;
            if(s.charAt(i)!=s.charAt(last))
            {
                return false;
            }
        }
        return true;
    }
}