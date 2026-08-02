class Solution {
    int lowerBound(int[] arr, int target) {
        // code here
        int i;
        for(i=0;i<arr.length;i++)
        {
            if(target<=arr[i])
            {
                return i;
            }
        }
        return i;
    }
}
