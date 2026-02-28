class Solution {
    public void findComb(int i,int[] arr,int k,List<List<Integer>> ans,List<Integer> ds)
    {
        if(i==arr.length)
        {
            if(k==0)
            {
                ans.add(new ArrayList<>(ds));
            }
            return ;
        }
        if(arr[i]<=k)
        {
            ds.add(arr[i]);
            findComb(i,arr,k-arr[i],ans,ds);
            ds.remove(ds.size()-1);

        }
        findComb(i+1,arr,k,ans,ds);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
       List<List<Integer>> ans=new ArrayList<>();
       findComb(0,candidates,target,ans,new ArrayList<>());
       return ans;
    }
}