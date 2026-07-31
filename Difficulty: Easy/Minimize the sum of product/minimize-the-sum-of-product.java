class Solution {
    public int minProductSum(int[] a, int[] b) {
        // code here
        Arrays.sort(a);
        Arrays.sort(b);
        
        int sum=0;
        int j=b.length-1;
        for(int i=0;i<a.length;i++)
        {
            sum=sum+(a[i]*b[j]);
            j--;
        }
        return sum;
    }
}