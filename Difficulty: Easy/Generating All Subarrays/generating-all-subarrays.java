class Solution {
    public List<List<Integer>> getSubArrays(int[] arr) {
        // code here
        List<List<Integer>> list=new ArrayList<>();
        
        for(int i=0;i<arr.length;i++)
        {
            List<Integer> temp=new ArrayList<>();
            for(int j=i;j<arr.length;j++)
            {
                temp.add(arr[j]);
                list.add(new ArrayList<>(temp));
            }
        }
        return list;
    }
}