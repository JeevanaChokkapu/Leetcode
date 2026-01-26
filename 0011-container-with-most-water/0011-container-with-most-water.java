class Solution {
    public int maxArea(int[] height) {
        int i=0,j=height.length-1;
        int ans=1;int max=Integer.MIN_VALUE;
        while(i<j)
        {
           int maxVerticalLine=Math.min(height[i],height[j]);
           ans=maxVerticalLine*(j-i);
           if(height[i]<=height[j])
           i++;
           else
           j--;
          max=Math.max(max,ans);
           
        }
        return max;
    }
}