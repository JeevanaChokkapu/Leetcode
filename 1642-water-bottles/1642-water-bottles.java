class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
       int total=numBottles;int rem=0;int n=numBottles;
       while(numBottles>=numExchange)
       {
        n=numBottles/numExchange;
          rem=numBottles%numExchange;
          total+=n;
          numBottles=n+rem;
       }
       return total;
    }
}