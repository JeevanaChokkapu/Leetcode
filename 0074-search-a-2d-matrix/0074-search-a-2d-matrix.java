class Solution {
    public boolean searchMatrix(int[][] mat, int target) {
        int m=mat.length;int n=mat[0].length;int k=0;
        for(int i=0;i<m;i++)
        {
            if(target>=mat[i][0] && target<=mat[i][n-1])
            k=i;
        }
        for(int i=0;i<n;i++)
        {
            if(mat[k][i]==target)
            return true;
        }
        return false;
    }
}