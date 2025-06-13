class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int low=0;
        int high=mat[0].length-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            int row=maxEle(mat,mat.length,mid);
            int left=mid-1>=0?mat[row][mid-1]:-1;
            int right=mid+1<mat[0].length?mat[row][mid+1]:-1;
            if(left<=mat[row][mid] && right<=mat[row][mid])
            {
                return new int[]{row,mid};
            }
            else if(left>mat[row][mid])
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return new int[]{-1,-1};
    }
    int maxEle(int[][] arr,int n,int col)
        {
            int max=-1;
            int ind=-1;
            for(int i=0;i<arr.length;i++)
            {
                if(arr[i][col]>max)
                {
                    max=arr[i][col];
                    ind=i;
                }
            }
            return ind;
        }
}