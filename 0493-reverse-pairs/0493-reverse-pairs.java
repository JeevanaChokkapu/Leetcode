
class Solution {
    public void merge(int arr[],int low,int mid,int high)
    {
        ArrayList<Integer> temp=new ArrayList<>();
        int left=low;
        int right=mid+1;
        while(left<=mid && right<=high)
        {
            if(arr[left]<=arr[right])
            {
                temp.add(arr[left]);
                left++;
                
            }
            else
            {
                temp.add(arr[right]);
                right++;
            }
        }
        while(left<=mid)
        {
            temp.add(arr[left]);
            left++;
        }
         while(right<=high)
        {
            temp.add(arr[right]);
            right++;
        }
        for(int i=low;i<=high;i++)
        {
            arr[i]=temp.get(i-low);
        }
        
    }
    public int mergeSort(int arr[],int low,int  high)
    {
        int cnt=0;
        int mid=(low+high)/2;
        if(low>=high)
        return cnt;
        cnt+=mergeSort(arr,low,mid);
        cnt+=mergeSort(arr,mid+1,high);
        cnt+=countPairs(arr,low,mid,high);
        merge(arr,low,mid,high);
    return cnt;
    }
    int countPairs(int arr[],int low,int mid,int high)
    {
        int cnt=0;
        int right=mid+1;
        for(int i=low;i<=mid;i++)
        {
            while(right<=high && (long)arr[i]>(long)2*arr[right])
            {
                  right++;
            }
                
                cnt=cnt+(right-(mid+1));

        }
        return cnt;
    }
    public int reversePairs(int[] nums) {
      return mergeSort(nums,0,nums.length-1);

    }
}