class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(!h.containsKey(nums[i]))
            {
                h.put(nums[i],1);
            }
            else
            {
                h.put(nums[i],h.getOrDefault(nums[i],0)+1);
            }
        }
        for(Map.Entry<Integer,Integer> x:h.entrySet())
        {
            if(x.getValue()==1)
            return x.getKey();
        }
        return 0;
    }
}