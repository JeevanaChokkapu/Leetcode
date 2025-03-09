class Solution {
    public int[] twoSum(int[] nums, int target) {
      int a[]=new int[2];
      HashMap<Integer,Integer> h=new HashMap<>();
       h.put(nums[0],0);
      for(int i=1;i<nums.length;i++)
      {
        if(h.containsKey(target-nums[i]))
        {
              a[0]=i;
              a[1]=h.get(target-nums[i]);
              break;
        }
         h.put(nums[i],i);
      }
      return a;
    }
}