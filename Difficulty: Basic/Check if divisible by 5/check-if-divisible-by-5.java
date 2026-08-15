class Solution {
    public boolean divisibleBy5(String n) {
        // code here
        int len=n.length();
        if(n.charAt(len-1)=='0' || n.charAt(len-1)=='5')
        return true;
        
        return false;
    }
};