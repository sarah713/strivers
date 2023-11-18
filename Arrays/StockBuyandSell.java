package Arrays;

public class StockBuyandSell {
    public int maxProfit(int[] prices) {
        int profit = Integer.MIN_VALUE, minPrice = prices[0];
        for (int i = 0; i < prices.length; i++) {
            minPrice = Math.min(minPrice, prices[i]);
            profit = Math.max(profit, prices[i] - minPrice);
        }
        return profit;
    }
}
