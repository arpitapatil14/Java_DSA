class Solution {
    public int maxProfit(int[] prices) {
        int profit=Integer.MIN_VALUE;
        int buy=Integer.MAX_VALUE;
        for(int price:prices){
            buy=Math.min(price,buy);
            profit=Math.max(profit,price-buy);

        }
        return profit;
        
    }
}