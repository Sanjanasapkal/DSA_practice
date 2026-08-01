class Solution {
    public void segregateElements(int[] arr) {
        // code here
        ArrayList<Integer> positive=new ArrayList<>();
        ArrayList<Integer> negative=new ArrayList<>();
        int i=0;
        for(int num:arr)
        {
            if(num>=0)
            {
                positive.add(num);
            }
            else
            {
                negative.add(num);
            }
        }
        for(i=0;i<positive.size();i++)
        {
            arr[i]=positive.get(i);
        }
        int j=0;
        while(j<negative.size())
        {
            arr[i]=negative.get(j);
            i++;
            j++;
        }
    }
}