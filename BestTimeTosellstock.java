public class BestTimeTosellstock {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MIN_VALUE, maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            minPrice = Math.min(minPrice, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - minPrice);
        }
        return maxProfit;
    }
}
