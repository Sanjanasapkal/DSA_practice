class Solution {
    void segregate0and1(int[] arr) {
        // code here
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==1)
            {
                count++;
            }
        }
        int i;
        for(i=0;i<arr.length-count;i++)
        {
            arr[i]=0;
        }
        while(i!=arr.length)
        {
            arr[i]=1;
           i++; 
        }
    }
}
