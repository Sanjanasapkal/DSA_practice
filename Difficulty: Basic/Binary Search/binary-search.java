class Solution {
    public boolean binarySearch(int[] arr, int k) {
        // code here
        int high=arr.length-1;
        int low=0;
        int mid=(low+high)/2;
        
        while(low<=high)
        {
            if(arr[mid]==k)
            {
                return true;
            }
            else if(arr[mid]<k)
            {
                low=mid+1;
                mid=(low+high)/2;
            }
            else if(arr[mid]>k)
            {
                high=mid-1;
                mid=(low+high)/2;
            }
        }
        return false;
    }
}