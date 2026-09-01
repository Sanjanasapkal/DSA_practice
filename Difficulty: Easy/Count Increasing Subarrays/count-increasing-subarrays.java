/*class Solution {
    public int countIncreasing(int[] arr) {
        // code here
        int count=0;
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i;j<arr.length-1;j++)
            {
                if(arr[j]>=arr[j+1])
                {
                   break; 
                }
                count++;
            }
        }
        return count;
    }
}*/
class Solution {
    public int countIncreasing(int[] arr) {
        int count = 0;
        int length = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                length++;
                count += length - 1;
            } else {
                length = 1;
            }
        }

        return count;
    }
}
