class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> m=new HashMap<>();
       int a[]=new int[2];
       for(int i=0;i<nums.length;i++)
       {
        if(m.containsKey(target-nums[i]))
        {
            int res=target-nums[i];
            a[0]=m.get(res);
            a[1]=i;
            break;
        }
        else
        m.put(nums[i],i);
         
      }
      return a;
    }
}