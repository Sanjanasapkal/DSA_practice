class Solution {
    int missingNum(int arr[]) {
        
        long sum=0;
        for(int num:arr)
        {
            sum+=num;
        }
        
        long n=arr.length+1;
        
        long expectedsum=n*(n+1)/2;
        
        
        return (int)(expectedsum-sum);
    }
}
    
    
    
    /*{
        // code here
        int i;
        for(i=1;i<=arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(arr[j]==i)
                {
                    break;
                }
                else if(j==arr.length-1)
                {
                    return i;
                }
            }
        }
        return i;
    }
}*/