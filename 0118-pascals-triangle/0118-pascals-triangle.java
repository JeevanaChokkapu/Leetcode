class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascal=new ArrayList<>();
        for(int i=0;i<numRows;i++)
        {
            ArrayList<Integer> temp=new ArrayList<>();
            temp.add(1);
            int res=1;
            for(int j=1;j<=i;j++)
            {
               res*=(i-j+1);
               res=res/j;
               temp.add(res);
            }
            pascal.add(temp);
        }
       return pascal;
    }
}