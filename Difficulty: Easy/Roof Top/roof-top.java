class Solution {
    public int maxStep(int[] arr) {
        // code here
        int Maxheight=0,height=0,flag=0;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]<arr[i+1] && flag==1)
            {
                height++;
                if(Maxheight<height)
                {
                    Maxheight=height;
                }
            }
            else if(arr[i]<arr[i+1])
            {
                height=1;
                if(Maxheight<height)
                {
                    Maxheight=height;
                }
                flag=1;
            }
            else
            {
                flag=0;
            }
        }
        return Maxheight;
    }
}