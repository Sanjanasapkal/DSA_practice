class Solution {
    public ArrayList<Integer> findKClosest(int[] arr, int k, int x) {
        // code here
        
        ArrayList<Integer> list=new ArrayList<>();
        int flag=0,i,left,right;
        for(i=0;i<arr.length;i++)
        {
            if(arr[i]==x)
            {
                flag=1;
                break;
            }
            if(arr[i]>x)
            {
                flag=2;
                break;
            }
            
        }
            left=i-1;
            right=i+1;
        if(flag==2)
        {
            right=i;
        }
        
        else if(flag==0 && i==arr.length-1)
        {
            if(arr[i]==x)
            {
                left=i-1;
                right=i+1;
            }
            else
            {
                left=i;
                right=i+1;
            }
        }
        
        int diffLeft,diffRight;
        while(left>=0 && right<arr.length && k!=0)
        {
            diffLeft=x-arr[left];
            diffRight=arr[right]-x;
            if(diffLeft==diffRight || diffLeft>diffRight)
            {
                list.add(arr[right]);
                right++;
                k--;
            }
            else
            {
                list.add(arr[left]);
                left--;
                k--;
            }
        }
        while(left>=0 && k!=0)
        {
            list.add(arr[left]);
            left--;
            k--;
        }
        while(right<arr.length && k!=0)
        {
            list.add(arr[right]);
            right++;
            k--;
        }
        return list;
    }
}