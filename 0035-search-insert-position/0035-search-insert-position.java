class Solution {
    public int searchInsert(int[] nums, int target) {
       int low=0;int high=nums.length-1;int mid=0;
       while(low<=high)
       {
         mid=(low+high)/2;
        if(nums[mid]==target)
        return mid;
        // if(target>nums[high])
        // return high+1;
        // if(target<nums[low])
        // return 0;
        if(nums[mid]<target)
        low=mid+1;
        else
        high=mid-1;
       }
       return low;
    }
}