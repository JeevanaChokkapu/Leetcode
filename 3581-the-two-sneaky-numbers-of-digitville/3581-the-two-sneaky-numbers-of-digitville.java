class Solution {
    public int[] getSneakyNumbers(int[] nums) {
  HashMap<Integer,Integer> h=new HashMap<>();
  int ans[]=new int[2];
  h.put(nums[0],1);
  for(int i=1;i<nums.length;i++)
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
int k=0;
for(Map.Entry<Integer,Integer> x:h.entrySet())
{
    if(x.getValue()==2)
    ans[k++]=x.getKey();
    
}
return ans;
    }
}