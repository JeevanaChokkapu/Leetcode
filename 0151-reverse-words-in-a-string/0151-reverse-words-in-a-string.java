class Solution {
    public String reverseWords(String s) {
        Stack<String> st=new Stack<>();
        String str="";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=' ')
                str+=s.charAt(i);
          else if(str.length()>0)
          {
            st.push(str);
            str="";
          }
               
        }
        if(str.length()>0)
        st.push(str);
        String ans="";
        while(!st.isEmpty())
        {
            ans+=st.pop();
            ans+=" ";
        }
        
        return ans.substring(0,ans.length()-1);
    }
}