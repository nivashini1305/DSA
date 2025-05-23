class Solution {
    public void setZeroes(int[][] matrix) {
        ArrayList<Integer> arrI = new ArrayList<>();
        ArrayList<Integer> arrJ = new ArrayList<>();
        for(int i=0;i<matrix.length;i++)
        {
          for(int j=0;j<matrix[i].length;j++)
            if(matrix[i][j]==0)
            {
               arrI.add(i);
               arrJ.add(j);
            }
        }
       for(int i:arrI)
       {
        for(int k=0;k<matrix[i].length;k++)
        {
            matrix[i][k]=0;
        }
       }
       for(int j:arrJ)
       {
        for(int k=0;k<matrix.length;k++)
        {
            matrix[k][j]=0;
        }
       }
    }
}