class Solution {
    void rearrange(ArrayList<Integer> arr) {
        // code here
        ArrayList<Integer> posArr=new ArrayList<>();
        ArrayList<Integer> negArr=new ArrayList<>();
        
        int n,i=0,j=0;
        int size=arr.size();
        for(i=0;i<size;i++)
        {
            n=arr.get(i);
            if(n<0)
            {
                negArr.add(n);
            }
            else
            {
                posArr.add(n);
            }
        }
        arr.clear();
        i=0;
        while(i<posArr.size() && j<negArr.size())
        {
            arr.add(posArr.get(i));
            arr.add(negArr.get(j));
            i++;
            j++;
        }
        while(i<posArr.size())
        {
            arr.add(posArr.get(i));
            i++;
        }
        while(j<negArr.size())
        {
            arr.add(negArr.get(j));
            j++;
        }
    }
}