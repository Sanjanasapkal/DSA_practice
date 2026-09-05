class Solution {
    int single(int[] arr) {
        // code here
        if(arr.length==1)
        {
            return arr[0];
        }
        else if(arr.length>1 && arr[0]!=arr[1])
        {
            return arr[0];
        }
        
        int i;
        for(i=1;i<arr.length-1;i++)
        {
            if(arr[i]!=arr[i+1] && arr[i]!=arr[i-1])
            {
                return arr[i];
            }
        }
        return arr[i];
    }
}