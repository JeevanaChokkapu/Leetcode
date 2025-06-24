class Solution {
    public void setZeroes(int[][] nums) {
        int m=nums.length;
        int n=nums[0].length;
        int col0=1;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
               if(nums[i][j]==0)
               {
                nums[i][0]=0;
                if(j==0)
                col0=0;
                else
                nums[0][j]=0;
               }
            }
        }
        for(int i=m-1;i>=1;i--)
        {
            for(int j=n-1;j>=1;j--)
            {
                if(nums[i][0]==0 || nums[0][j]==0)
                {
                    nums[i][j]=0;
                }
            }
        }
        if(nums[0][0]==0)
        {
            for(int i=0;i<n;i++)
            nums[0][i]=0;
        }
         if(col0==0)
        {
            for(int i=0;i<m;i++)
            nums[i][0]=0;
        }
    }
}