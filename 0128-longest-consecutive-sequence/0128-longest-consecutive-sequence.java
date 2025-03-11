class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)
        return 0;
        if(nums.length==1)
        return 1;
        Arrays.sort(nums);
        int max=0;int store=1;int lastsmaller=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]-1==lastsmaller )
            {
                max++;
                lastsmaller=nums[i];
            }
            else if(nums[i]!=lastsmaller)
            {
                max=1;
                lastsmaller=nums[i];
            }
            store=Math.max(max,store);
        }
       
        return store;
    }
}