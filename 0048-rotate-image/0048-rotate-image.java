class Solution {
    public void rotate(int[][] matrix) {
       int m=matrix.length;
       int n=matrix[0].length;
       for(int i=0;i<m-1;i++)
       {
        for(int j=i;j<n;j++)
        {
            int temp=matrix[i][j];
            matrix[i][j]=matrix[j][i];
            matrix[j][i]=temp;
        }
       }
       for(int i=0;i<m;i++)
       {
        int j=0;int k=n-1;
        while(j<=k)
        {
            int temp=matrix[i][j];
            matrix[i][j]=matrix[i][k];
            matrix[i][k]=temp;
            j++;k--;
        }
       }

    }
}