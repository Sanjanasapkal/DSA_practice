class Solution {
    public int kthElement(int a[], int b[], int k) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        for(int i:a)
        {
            list.add(i);
        }
        for(int i:b)
        {
            list.add(i);
        }
        Collections.sort(list);
        k=k-1;
        for(int i=0;i<list.size();i++)
        {
            if(i==k)
            {
                return list.get(i);
            }
        }
        return 0;
    }
}