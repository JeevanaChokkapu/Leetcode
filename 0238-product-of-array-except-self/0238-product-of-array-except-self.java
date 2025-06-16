class Solution {
    public int[] productExceptSelf(int[] nums) {
       int answer[]=new int[nums.length];
       int zero=0;int product=1;int store=0;
      for(int i=0;i<nums.length;i++)
      {
        if(nums[i]==0)
        {
           zero++;
           store=i;
        }
      }
       for(int i=0;i<nums.length;i++)
       {
           if(nums[i]!=0)
           {
            product=product*nums[i];
           }
       }
       if(zero>1)
       {
        return answer;
       }
      else if(zero==1)
      {
        answer[store]=product;
      }
      else
      {
         for(int i=0;i<nums.length;i++)
         {
            answer[i]=product/nums[i];
         }
      }
      return answer;
    }
}