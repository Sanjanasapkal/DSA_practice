class Solution {
    public int findTarget(int arr[], int target) {
        // code here
        int i;
        for(i=0;i<arr.length;i++)
        {
            if(target==arr[i])
            {
                return i;
            }
        }
        return -1;
    }
}