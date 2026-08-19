class Solution {
    public char nonRepeatingChar(String s) {
        // code here
        char key;
        int j,k;
        for(int i=0;i<s.length();i++)
        {
            key=s.charAt(i);
            for(j=i+1;j<s.length();j++)
            {
                if(key==s.charAt(j))
                {
                    break;
                }
            }
            for(k=i-1;k>=0;k--)
            {
                if(key==s.charAt(k))
                {
                    break;
                }
            }
            if(j==s.length() && k==-1)
            {
                return key;
            }
        }
        return '$';
    }
}
