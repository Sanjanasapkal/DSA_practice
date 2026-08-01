class Solution {
    boolean twoSum(int arr[], int target) {
        // code here
        HashSet<Integer> set=new HashSet<>();
        
        int sub;
        for(int i=0;i<arr.length;i++)
        {
            sub=target-arr[i];
            if(set.contains(sub))
            {
                return true;
            }
            set.add(arr[i]);
        }
        return false;
    }
}


/*

for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]+arr[j]==target)
                {
                    return true;
                }
            }
        }
        return false;

*/