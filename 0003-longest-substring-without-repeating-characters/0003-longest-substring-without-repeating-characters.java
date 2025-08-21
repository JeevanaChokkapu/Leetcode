class Solution {
    public int lengthOfLongestSubstring(String s) {
      int l=0;int max=0;
      HashSet<Character> h=new HashSet<>();
      for(int r=0;r<s.length();r++)
      {
          if(h.contains(s.charAt(r)))
          {
            while(l<r && h.contains(s.charAt(r)))
            {
                h.remove(s.charAt(l));
                l++;
            }
          }
            h.add(s.charAt(r));
            max=Math.max(max,r-l+1);
          
      }
      return max;
    }
}