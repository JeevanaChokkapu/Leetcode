class Solution {
    public void rotate(int[] nums, int k) {
      
       if(nums.length<=1)
       return ;
         k=k%nums.length;   
       swap(nums,0,nums.length-1); 
       swap(nums,0,k-1);
       swap(nums,k,nums.length-1);
        
       
      
        
    
    
    
       
        
            
            
            
            
            

 }
    void swap(int arr[],int first,int last)
    {
        while(first<=last)
        {
            int temp=arr[first];
            arr[first]=arr[last];
            arr[last]=temp;
            first++;
            last--;
        }
    }
}