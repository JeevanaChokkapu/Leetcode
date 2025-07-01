class Solution {
    public int longestConsecutive(int[] nums) {
      if(nums.length==0)
      return 0; 
      if(nums.length==1)
      return 1;
      Arrays.sort(nums);
      int max=1;int cnt=1;
      for(int i=1;i<nums.length;i++)
      {
        if(nums[i]-1==nums[i-1])
        {
        cnt++;
        max=Math.max(max,cnt);
        }
        else if(nums[i]==nums[i-1])
        {
        continue;
        }
        else
        cnt=1;

      }
      
      return max;
    }
}