class Solution {
    public ArrayList<Integer> commonElements(int a[], int b[], int c[]) {
        ArrayList<Integer> ans = new ArrayList<>();

        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length && k < c.length) {

            if (a[i] == b[j] && b[j] == c[k]) {
                ans.add(a[i]);

                int x = a[i];

                while (i < a.length && a[i] == x) i++;
                while (j < b.length && b[j] == x) j++;
                while (k < c.length && c[k] == x) k++;
            }
            else if (a[i] < b[j]) {
                i++;
            }
            else if (b[j] < c[k]) {
                j++;
            }
            else {
                k++;
            }
        }

        return ans;
    }
}