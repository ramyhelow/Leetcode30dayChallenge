public class Q5_BestTimetoBuyandSellStockII {
    public int maxProfit(int[] prices) {
        int currentMax = 0;
        int totalMax = 0;
        for(int i=1; i<prices.length; i++){
            currentMax = Math.max(currentMax, currentMax += prices[i]-prices[i-1]);
            totalMax = Math.max(currentMax, totalMax);
        }
        return totalMax;
    }
}
