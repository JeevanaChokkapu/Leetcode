class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> h=new HashMap<>();
        int max=-1;
        for(int i=0;i<arr.length;i++)
        {
            if(!h.containsKey(arr[i]))
            h.put(arr[i],1);
            else
            h.put(arr[i],h.get(arr[i])+1);
        }
        for(Map.Entry<Integer,Integer> x:h.entrySet())
        {
            if(x.getKey()==x.getValue())
            max=Math.max(max,x.getKey());
        }
        return max;
    }
}