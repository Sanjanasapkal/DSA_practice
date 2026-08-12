class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        int n = arr.length;
        int[] freq = new int[n + 1];

        for (int x : arr) {
            freq[x]++;
        }

        int duplicate = -1;
        int missing = -1;

        for (int i = 1; i <= n; i++) {
            if (freq[i] == 2)
                duplicate = i;
            if (freq[i] == 0)
                missing = i;
        }

        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(duplicate);
        ans.add(missing);

        return ans;
    }
}