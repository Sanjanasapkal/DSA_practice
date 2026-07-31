class Solution {
    int transitionPoint(int arr[]) {
        // code here
        if(arr[arr.length-1]==0)
        {
            return -1;
        }
        else
        {
            for(int i=0;i<arr.length;i++)
            {
                if(arr[i]==1)
                {
                    return i;
                }
            }
        }
        return -1;
    }
}