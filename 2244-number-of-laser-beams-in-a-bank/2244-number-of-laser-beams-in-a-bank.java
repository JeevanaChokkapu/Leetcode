class Solution {
    public int numberOfBeams(String[] bank) {
        int a[]=new int[bank.length];
        for(int i=0;i<bank.length;i++)
        {
            int cnt=0;
            String s=bank[i];
            for(int j=0;j<bank[i].length();j++)
            {
                 if(s.charAt(j)=='1')
                 cnt++;
            }
            a[i]=cnt;
        }
        int ans=0;int curr=a[0];
        for(int i=1;i<a.length;i++)
        {
            if(a[i]==0)
            continue;
            if(curr!=0 && a[i]!=0)
            {
                ans=ans+curr*a[i];
                curr=a[i];
            }
            else
            curr=a[i];

        }
        return ans;
    }
}