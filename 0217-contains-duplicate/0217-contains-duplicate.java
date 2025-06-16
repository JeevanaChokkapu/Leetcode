class Solution {
    public boolean containsDuplicate(int[] nums) {
     HashSet<Integer> h=new HashSet<>();
     int n=nums.length;
     for(int i=0;i<n;i++)
     {
        h.add(nums[i]);
     }
     if(n==h.size())
     return false;
     return true;
    }
}