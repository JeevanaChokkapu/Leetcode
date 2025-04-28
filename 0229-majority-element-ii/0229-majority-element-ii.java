class Solution {
    public List<Integer> majorityElement(int[] nums) {
      ArrayList<Integer> l=new ArrayList<>();
      HashMap<Integer,Integer> h=new HashMap<>();
      h.put(nums[0],1);
      for(int i=1;i<nums.length;i++)
      {
        if(!h.containsKey(nums[i]))
             h.put(nums[i],1);
        else
            h.put(nums[i],h.getOrDefault(nums[i],0)+1);
      }  
      for(Map.Entry<Integer,Integer> x:h.entrySet())
      {
        if(x.getValue()>nums.length/3)
        l.add(x.getKey());
      }
      return l;
    }
}