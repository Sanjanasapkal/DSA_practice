class Solution {
    public double findMedian(int[] arr) {
        Arrays.sort(arr);
        int len = arr.length;

        if (len % 2 == 0) {
            int mid = len / 2;
            return (arr[mid] + arr[mid - 1]) / 2.0;
        } else {
            return arr[len / 2];
        }
    }
}