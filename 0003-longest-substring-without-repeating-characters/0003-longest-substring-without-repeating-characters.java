class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0;
        for(int i=0;i<s.length();i++)
        {
            List<Character> l=new ArrayList<>();
            l.add(s.charAt(i));
             String ans=String.valueOf(s.charAt(i));
           
            int count=1;
            for(int j=i+1;j<s.length();j++)
            {
               if(!l.contains(s.charAt(j)))
               {
                l.add(s.charAt(j));
                 ans+=s.charAt(j);
                 count++;
               }
               else
               break;
            }
          max=Math.max(max,count);
        }
        return max;
    }
}