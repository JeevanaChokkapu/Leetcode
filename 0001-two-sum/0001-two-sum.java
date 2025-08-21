class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> h=new HashMap<>();
        h.put(nums[0],0);
        int ans[]=new int[2];
        for(int i=1;i<nums.length;i++)
        {
            if(h.containsKey(target-nums[i]))
            {
                ans[0]=i;
                ans[1]=h.get(target-nums[i]);
            }
            else
            {
                h.put(nums[i],i);
            }
        }
        return ans;
    }
}