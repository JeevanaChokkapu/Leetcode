class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;int element=0;int count=0;
        for(int i=0;i<n;i++)
        {
           if(count==0)
           {
            element=nums[i];
            count++;
           } 
           else if(element==nums[i])
           count++;
           else
           count--;
        }
        int count1=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==element)
            count1++;
        }
        if(count1>n/2)
        return element;
        return -1;
    }
}