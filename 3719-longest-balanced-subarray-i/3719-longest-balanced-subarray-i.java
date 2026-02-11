class Solution {
    public int longestBalanced(int[] nums) {
        
        int max=0;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            HashSet<Integer> odd=new HashSet<>();
        HashSet<Integer> even=new HashSet<>();
            for(int j=i;j<n;j++)
            {
                if(nums[j]%2!=0)
                odd.add(nums[j]);
                else
                even.add(nums[j]);
            
            if(odd.size()==even.size())
            max=Math.max(max,j-i+1);
            }

        }
        return max;
    }
}