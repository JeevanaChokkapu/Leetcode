class Solution {
    public int subarraySum(int[] nums, int k) {
        int noofsub=0;
        for(int i=0;i<nums.length;i++)
        {
            int str=0;
            for(int j=i;j<nums.length;j++)
            {
                str+=nums[j];
                if(str==k)
                {
                    noofsub++;
                }
            }
        }
        return noofsub;
    }
}