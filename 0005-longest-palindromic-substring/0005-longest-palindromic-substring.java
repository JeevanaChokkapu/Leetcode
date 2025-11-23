class Solution {
    public String longestPalindrome(String s) {
    int n=s.length()-1;String ans="";
 
    for(int i=0;i<=n;i++)
    {
        int count=1;
        for(int j=i;j<=n;j++)
        {
             if(palindrome(s,i,j))
             {
                count=j-i+1;
                if(count>ans.length())
                {
               ans=s.substring(i,j+1);
                }
             }
        }
    }
   
return ans;
     
    
    }
    public boolean palindrome(String s,int i,int j)
    {
        while(i<=j)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                return false;
            }
                i++;j--;
        }
        return true;
    }
}