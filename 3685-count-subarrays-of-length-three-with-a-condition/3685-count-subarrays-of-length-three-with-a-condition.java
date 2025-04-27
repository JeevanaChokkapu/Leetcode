class Solution {
    public int countSubarrays(int[] nums) {
       int n=nums.length;int count=0;
       if(n==3)
       {
        if(nums[0]+nums[2]==nums[1]/2.0)
        return 1;
       }
       else
       {
        for(int i=0;i<n-2;i++)
        {
            if(nums[i]+nums[i+2]==nums[i+1]/2.0)
            count++;
        }
       }
       return count;
    }
}