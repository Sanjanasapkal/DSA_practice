class Solution {
    public ArrayList<Integer> kLargest(int[] arr, int k) {
        // code here
        ArrayList<Integer>  list=new ArrayList<>();
        
        Arrays.sort(arr);
        
        for(int i=arr.length-1;i>=0;i--)
        {
            if(k==0)
            {
                break;
            }
            list.add(arr[i]);
            k--;
        }
        return list;
    }
}
