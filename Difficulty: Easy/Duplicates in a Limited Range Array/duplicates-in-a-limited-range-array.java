class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {

        ArrayList<Integer> duplicate = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int n : arr) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        for (int x : map.keySet()) {
            if (map.get(x) == 2) {
                duplicate.add(x);
            }
        }

        return duplicate;
    }
}