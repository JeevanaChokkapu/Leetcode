class Solution {
    public int[][] merge(int[][] intervals) {
        List<List<Integer>> l=new ArrayList<>();
        Arrays.sort(intervals,(a,b)->(a[0]-b[0]));
        int n=intervals.length;
        for(int i=0;i<n;i++)
        {
            int start=intervals[i][0];
            int end=intervals[i][1];
            if(!l.isEmpty() && end<=l.get(l.size()-1).get(1))
            continue;
            for(int j=i+1;j<n;j++)
            {
                if(intervals[j][0]<=end)
                {
                    end=Math.max(end,intervals[j][1]);
                }
                else
                {
                    break;
                }
            }
            l.add(Arrays.asList(start,end));
        }
      int[][] result = new int[l.size()][2];
        for (int i = 0; i < l.size(); i++) {
            result[i][0] = l.get(i).get(0);
            result[i][1] = l.get(i).get(1);
        }

        return result;
    }
}