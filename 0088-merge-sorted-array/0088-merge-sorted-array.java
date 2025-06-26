class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1;int j=n-1;
        if(m==0)
        nums1[0]=nums2[0] ;
        if(n==0)
        return ;
       while(i>=0 && j>=0)
       {
        if(nums2[j]>=nums1[i])
        {
            nums1[i+j+1]=nums2[j];
            j--;
        }
        else
        {
            nums1[i+j+1]=nums1[i];
            i--;
        }
       }
       while(j>=0)
       {
        nums1[i]=nums2[j];
        j--;
       }
    }
}