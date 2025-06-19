class Solution {
    public int maxArea(int[] height) {
       int min=Integer.MAX_VALUE;
       int max=Integer.MIN_VALUE;
       int i=0;int j=height.length-1;
       while(i<j)
       {
        min=Math.min(height[i],height[j]);
        max=Math.max(max,min*(j-i));
        if(height[i]<height[j])
        i++;
        else
        j--;
       }
       return max;
    }
}