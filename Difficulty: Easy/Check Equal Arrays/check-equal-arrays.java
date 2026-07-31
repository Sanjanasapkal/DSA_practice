class Solution {
    public static boolean checkEqual(int[] a, int[] b) {
        // code here
        Arrays.sort(a);
        Arrays.sort(b);
        
        for(int i=0;i<a.length;i++)
        {
            if(a[i]!=b[i])
            {
                return false;
            }
        }
        return true;
    }
}

/*

int temp,j;
        for(int i=1;i<a.length;i++)
        {
            for(j=0;j<a.length-i;j++)
            {
                if(a[j]>a[j+1])
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
                if(b[j]>b[j+1])
                {
                    temp=b[j];
                    b[j]=b[j+1];
                    b[j+1]=temp;
                }
            }
            if(a[j]!=b[j])
            {
                return false;
            }
        }
        if(a[0]!=b[0])
        {
            return false;
        }
        return true;
        
*/