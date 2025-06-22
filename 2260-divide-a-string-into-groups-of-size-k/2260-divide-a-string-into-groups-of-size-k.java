class Solution {
    public String[] divideString(String s, int k, char fill) {
        int n=0;int j=0;
        if(s.length()%k==0)
        n=s.length()/k;
        else
        n=(s.length()/k)+1;
        String ans[]=new String[n];
        for(int i=0;(i<n);i++)
        {
            int cnt=k;
            String str="";
            while(cnt!=0)
            {
              
               if(j<s.length())
               str+=s.charAt(j);
               else
                 str+=fill;
               j++;cnt--;
            }
            ans[i]=str;
        }
return ans;
    }
}