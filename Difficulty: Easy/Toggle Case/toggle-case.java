class Solution {
    public String toggleCase(String s) {
        // code here
        StringBuilder sb=new StringBuilder(s);
        char ch;
        for(int i=0;i<s.length();i++)
        {
            ch=s.charAt(i);
            if(Character.isUpperCase(ch))
            {
                ch=Character.toLowerCase(ch);
                sb.setCharAt(i,ch);
            }
            else
            {
                ch=Character.toUpperCase(ch);
                sb.setCharAt(i,ch);
            }
        }
        s=sb.toString();
        return s;
    }
}
