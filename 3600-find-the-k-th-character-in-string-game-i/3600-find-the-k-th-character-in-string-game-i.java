class Solution {
    public char kthCharacter(int k) {
        String s="ab";
        int n=k;
        while(s.length()<=k)
        {
           StringBuilder newStr = new StringBuilder();
            for(int i=0;i<s.length();i++)
            {
               char ch=s.charAt(i);
               if(ch=='z')
               newStr.append('a');
               else
               newStr.append((char)(ch+1));
            }
            s=s.concat(newStr.toString());
        }
        return s.charAt(k-1);
    }
}