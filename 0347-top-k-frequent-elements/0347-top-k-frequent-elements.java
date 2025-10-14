class Solution {
    public int[] topKFrequent(int[] arr, int k) {
       HashMap<Integer,Integer> h=new HashMap<>();
       for(int i=0;i<arr.length;i++)
       {
        if(!h.containsKey(arr[i]))
        h.put(arr[i],1);
        else
        h.put(arr[i],h.getOrDefault(arr[i],0)+1);
       }
      PriorityQueue<Integer> p=new PriorityQueue<>((a,b) -> h.get(b)-h.get(a));
      for(int key:h.keySet())
      {
        p.add(key);
      }
      int a[]=new int[k];
      for(int i=0;i<k;i++)
      {
        a[i]=p.poll();
      }
      return a;
    }
}