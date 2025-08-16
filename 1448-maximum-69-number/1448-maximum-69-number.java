class Solution {
    public int maximum69Number (int num) {
        int number=num;int count=0;int max=num;
        while(number>0)
        {
            int nums=num;
            int rem=number%10;
            count++;
        int str=count;
        int nonzero=1;
        while(str>1)
        {
            nonzero=nonzero*10;
            str--;
        }
        if(rem==9)
        {
            nums=nums-(3*nonzero);
        }
        else
        {
            nums=nums+(3*nonzero);
        }
        max=Math.max(max,nums);
                number=number/10;
        }
        return max;
    }
}