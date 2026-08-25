class Solution {
    public void rotateMatrix(int[][] mat) {
        // code here
        int j,i=0;
        ArrayList<Integer> list=new ArrayList<>();
        for(j=mat[i].length-1;j>=0;j--)
        {
            for(i=0;i<mat.length;i++)
            {
                list.add(mat[i][j]);
            }
        }
        int k=0;
        for(i=0;i<mat.length;i++)
        {
            for(j=0;j<mat[i].length;j++)
            {
                mat[i][j]=list.get(k++);
            }
        }
            
    }
}