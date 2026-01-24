class Solution {
    public void moveZeroes(int[] nums) {
        // if(nums.length==1)
        // return ;
        // if(nums.length==2)
        // {
        //     if(nums[0]==0 && nums[1]!=0)
        //     {
        //         int temp=nums[0];
        //         nums[0]=nums[1];
        //         nums[1]=temp;
        //     }
        //     return;
        // }
        int i=0,j=1;
        while(j<nums.length)
        {
            if(nums[i]!=0)
            {
                 i++;
                 j=Math.max(j,i+1);
            }
           
            else if(nums[j]==0)
            j++;
            else
            {
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;j++;
            }
        }
    }
}