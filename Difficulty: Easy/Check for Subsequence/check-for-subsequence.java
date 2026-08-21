class Solution {
    public boolean isSubSeq(String s1, String s2) {
        // code here
        int j=0;
        for(int i=0;i<s2.length();i++)
        {
            if(j<s1.length())
            {
              if(s1.charAt(j)==s2.charAt(i))
                {
                    j++;
                }  
            }
            else
            {
                return true;
            }
        }
        if(j<s1.length())
        {
            return false;
        }
    
    return true;
    }
};