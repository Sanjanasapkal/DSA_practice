class Solution {
    public int findDuplicate(int[] arr) {
        HashSet<Integer> set=new HashSet<>();
        
        for(int num:arr)
        {
            if(set.contains(num))
            return num;
            
            set.add(num);
        }
        return -1;
    }
}



// code here
        /*int count;
        for(int i=1;i<=arr.length;i++)
        {
            count=0;
            for(int j=0;j<arr.length;j++)
            {
                if(i==arr[j])
                {
                    count++;
                    if(count==2)
                    {
                        return i;
                    }
                }
            }
        }
        return -1;*/