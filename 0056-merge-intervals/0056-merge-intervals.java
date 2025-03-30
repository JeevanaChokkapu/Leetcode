class Solution {
    public int[][] merge(int[][] intervals) {
        List<List<Integer>> l=new ArrayList<>();
        Arrays.sort(intervals,(a,b)->(a[0]-b[0]));
        int n=intervals.length;
       for(int i=0;i<n;i++)
       {
        if(l.isEmpty() || intervals[i][0]>l.get(l.size()-1).get(1))
        {
            l.add(Arrays.asList(intervals[i][0],intervals[i][1]));
        }
        else
        {
            l.get(l.size()-1).set(1,Math.max(l.get(l.size()-1).get(1),intervals[i][1]));
        }
       }
      int[][] result = new int[l.size()][2];
        for (int i = 0; i < l.size(); i++) {
            result[i][0] = l.get(i).get(0);
            result[i][1] = l.get(i).get(1);
        }

        return result;
    }
}