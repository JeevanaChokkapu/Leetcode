class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> res=new ArrayList<>();
        generateAll("",n,res);
       return res;
        
    }
    public boolean isValid(String curr,int n, List<String> res)
{
    int balance=0;
    for(int i=0;i<2*n;i++)
    {
        if(curr.charAt(i)=='(')
        balance++;
        else
        balance--;
        if(balance<0)
        return false;
    }
    return balance==0;
}
public void generateAll(String curr,int n,List<String> res)
{
    if(curr.length()==2*n)
     {
        if(isValid(curr,n,res))
        res.add(curr);
        return;
     }
     if(curr.length()==1 && curr.charAt(0)==')')
     return;
     generateAll(curr+'(',n,res);
     generateAll(curr+')',n,res);
}


}
