class Solution {
    int middle(int a, int b, int c) {
        // code here
        if(a>b && a>c)
        {
           if(b>c)
           {
               return b;
           }
           else
           {
               return c;
           }
        }
        else if(b>c && b>a)
        {
            if(c>a)
            {
                return c;
            }
            return a;
        }
        else
        {
            if(a>b)
            {
                return a;
            }
            return b;
        }
    }
}