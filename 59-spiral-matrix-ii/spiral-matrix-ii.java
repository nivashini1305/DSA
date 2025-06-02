class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix=new int[n][n];
        int value=1;
        int left=0;
        int top=0;
        int right=n-1;
        int bottom=n-1;
        while(left<=right && top<=bottom)
        {
             for(int i=left;i<=right;i++)
            {
                matrix[top][i]=value;
                value+=1;
            }
            top++;
            for(int i=top;i<=bottom;i++)
            {
                matrix[i][right]=value;
                value+=1;
            }
            right--;
            if(top<=bottom)
            {
                for(int i=right;i>=left;i--)
                {
                    matrix[bottom][i]=value;
                    value+=1;
                }
                bottom--;
            }
            if(left<=right)
            {
                for(int i=bottom;i>=top;i--)
                {
                   matrix[i][left]=value;
                   value+=1;
                }
            left++;
            }
        }
        return matrix;
    }
}