class Solution {
    public int[] minOperations(String boxes) {
        int result[]=new int[boxes.length()];
        ArrayList<Integer> l=new ArrayList<>();
        for(int i=0;i<boxes.length();i++)
        if(boxes.charAt(i)=='1')
        l.add(i+1);
        for(int i=0;i<boxes.length();i++)
        {
            for(int j=0;j<l.size();j++)
            {
                result[i]+=Math.abs((i+1)-l.get(j));
            }
        }
        return result;
    }
}