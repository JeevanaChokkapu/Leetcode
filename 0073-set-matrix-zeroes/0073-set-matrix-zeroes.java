class Solution {
    public void setZeroes(int[][] nums) {
        int m=nums.length;
        int n=nums[0].length;
        int row[]=new int[m];
        int col[]=new int[n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
               if(nums[i][j]==0)
               {
                row[i]=1;
                col[j]=1;
               }
            }
        }
        for(int i=0;i<m;i++)
        {
            if(row[i]==1)
            {
                for(int j=0;j<n;j++)
                {
                    nums[i][j]=0;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            if(col[i]==1)
            {
                for(int j=0;j<m;j++)
                {
                    nums[j][i]=0;
                }
            }
        }
    }
}