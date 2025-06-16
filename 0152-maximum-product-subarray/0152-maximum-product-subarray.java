class Solution {
    public int maxProduct(int[] nums) {
        int negatives=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<0)
            negatives++;
        }
        int product=1;
        int max=Integer.MIN_VALUE;
        if(negatives==0 && negatives%2==0)
        {
               for(int i=0;i<nums.length;i++)
               {
                if(nums[i]==0)
                product=1;
               product=product*nums[i];
                max=Math.max(max,product);
                if(nums[i]==0)
                product=1;
               }
        }
        else
        {
            int prefix=1;int suffix=1;
            for(int i=0;i<nums.length;i++)
            {
                if(prefix==0)
                prefix=1;
                if(suffix==0)
                suffix=1;
                prefix=prefix*nums[i];
                suffix=suffix*nums[nums.length-i-1];
                max=Math.max(max,Math.max(prefix,suffix));
               
               
            }
        }
        return max;
    }
}