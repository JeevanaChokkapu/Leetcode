class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            h.put(nums[i],h.getOrDefault(nums[i],0)+1);
        }
        int ans=0;
        for(Map.Entry<Integer,Integer> x:h.entrySet())
        {
            if(x.getValue()>n/2)
            ans=x.getKey();
        }
        return ans;
    }
}