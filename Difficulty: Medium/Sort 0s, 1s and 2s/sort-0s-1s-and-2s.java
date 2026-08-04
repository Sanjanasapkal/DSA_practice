class Solution {
    public void sort012(int[] arr) {
        // code here
        int count0=0,count1=0,count2=0,i;
        for(i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
            {
                count0++;
            }
            else if(arr[i]==1)
            {
                count1++;
            }
            else
            {
                count2++;
            }
        }
        i=0;
        while(i<count0)
        {
            arr[i]=0;
            i++;
        }
        count1=count1+count0;
        while(i<count1)
        {
            arr[i]=1;
            i++;
        }
        count2=count1+count2;
        while(i<count2)
        {
            arr[i]=2;
            i++;
        }
    }
}