class Solution {
    public double myPow(double x, int n) {
        double ans=x;double temp=1;long n1=n;
        if(n==0 || x==1)
        return 1;

        if(n1<0)
        n1=-n1;
        
        while(n1>1)
        {
            if(n1%2==0)
            {
                ans=ans*ans;
                n1=n1/2;
            }
            else
            {
                temp=temp*ans;
                n1--;
            }
        }
        if(n<0)
        return 1/(temp*ans);
        return temp*ans;
    }
}