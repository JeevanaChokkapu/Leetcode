class Solution {
    public int[][] merge(int[][] intervals) {
      List<List<Integer>> l=new ArrayList<>();
      Arrays.sort(intervals,Comparator.comparingInt(a->a[0]));
      for(int i=0;i<intervals.length;i++)
      {
        if(l.isEmpty() ||intervals[i][0]>l.get(l.size()-1).get(1))
        l.add(Arrays.asList(intervals[i][0],intervals[i][1]));
        else
        l.get(l.size()-1).set(1,Math.max(l.get(l.size()-1).get(1),intervals[i][1]));
      }
      int a[][]=new int[l.size()][2];
      for(int i=0;i<l.size();i++)
      {
        a[i][0]=l.get(i).get(0);
        a[i][1]=l.get(i).get(1);
      }
      return a;
    }
}