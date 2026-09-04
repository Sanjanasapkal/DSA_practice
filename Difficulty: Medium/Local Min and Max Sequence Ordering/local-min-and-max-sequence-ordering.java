class Solution {
    public ArrayList<Integer> extractPoints(int[] arr) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Integer> set=new ArrayList<>();
        
        int j;
        
        for(j=0;j<arr.length-1;j++)
        {
            if(arr[j]==arr[j+1])
            {
                continue;
            }
            else
            {
                set.add(arr[j]);
            }
        }
        set.add(arr[j]);
        
        if(set.size()==1)
        {
            return set;
        }
        else
        {
            list.add(set.get(0));
            int i;
            for(i=1;i<set.size()-1;i++)
            {
                if(set.get(i-1)<set.get(i) && set.get(i)>set.get(i+1))
                {
                    list.add(set.get(i));
                    continue;
                }
                if(set.get(i-1)>set.get(i) && set.get(i)<set.get(i+1))
                {
                    list.add(set.get(i));
                    continue;
                }
            }
            list.add(set.get(i));
            return list;   
        }
    }
}