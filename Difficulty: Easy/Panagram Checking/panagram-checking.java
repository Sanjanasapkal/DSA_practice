class Solution {
    public static boolean checkPangram(String s) {
        // code here
        s=s.toLowerCase();
        String alpha="abcdefghijklmnopqrstuvwxyz";
        for(int i=0;i<alpha.length();i++)
        {
            if(s.indexOf(alpha.charAt(i))==-1)
            {
                return false;
            }
        }
        return true;
    }
}