class Solution {
    public int longestConsecutive(int[] nums) {
       HashSet<Integer> h=new HashSet<>();
       if(nums.length==0)
       return 0;
       int max=1;
       for(int i=0;i<nums.length;i++)
       {
        h.add(nums[i]);
       }
       for(int it:h)
       {
        if(!h.contains(it-1))
        {
            int cnt=1;
            int x=it;
            while(h.contains(x+1))
            {
                x=x+1;
                cnt++;
            }
            max=Math.max(max,cnt);
        }
       }
       return max;
    }
}