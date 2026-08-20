class Solution {
    public void sortInWave(int arr[]) {
        // code here
        int temp;
        for(int i=0;i<arr.length;i=i+2)
        {
            if((i+1)==arr.length)
            {
                return;
            }
            temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
        return;
    }
}
