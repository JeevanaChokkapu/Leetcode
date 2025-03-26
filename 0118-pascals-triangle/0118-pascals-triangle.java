class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascal=new ArrayList<>();
        pascal.add(Arrays.asList(1));
       for(int i=1;i<numRows;i++)
       {
         List<Integer> l=new ArrayList<>();
         l.add(1);
         int res=1;
         for(int j=1;j<i;j++)
         {
            res=res*(i-j+1);
            res=res/j;
            l.add(res);
         }
         l.add(1);
         pascal.add(l);
       }
       return pascal;
    }
}