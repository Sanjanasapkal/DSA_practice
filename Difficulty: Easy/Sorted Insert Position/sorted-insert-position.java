class Solution {
    public int searchInsertK(int arr[], int k) {
        // code here
        int low=0,high=arr.length-1;
        int mid=(low+high)/2;
        while(low<=high)
        {
            mid=(low+high)/2;
            if(k==arr[mid])
            {
                return mid;
            }
            else if(k<arr[mid])
            {
                high=mid-1;
            }
            else if(k>arr[mid])
            {
                low=mid+1;
            }
        }
        if(arr[mid]>k)
        {
            return mid;
        }
        else
        return mid+1;
    }
};