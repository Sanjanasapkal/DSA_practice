class Solution {
    public ArrayList<ArrayList<Integer>> transpose(int[][] mat) {
        // code here
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        int size=mat.length-1;
        for(int j=0;j<=size;j++)
        {
            ArrayList<Integer> temp=new ArrayList<>();
            for(int i=0;i<=size;i++)
            {
                temp.add(mat[i][j]);
            }
            list.add(temp);
        }
        
        return list;
    }
}