class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0,maxconsecutive=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1)
            {
                max++;
                maxconsecutive=Math.max(max,maxconsecutive);
            }
            else
            max=0;

        }
        return maxconsecutive;
    }
}