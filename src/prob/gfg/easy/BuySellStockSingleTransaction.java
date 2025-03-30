package prob.gfg.easy;

public class BuySellStockSingleTransaction {
    public static void main(String[] args) {
        int[] prices = {61, 44, 70, 78, 73, 95, 27, 1};
        System.out.println(maximumProfit(prices));
    }

    public static int maximumProfit(int[] prices) {
        int n = prices.length;
        int min = prices[0];
        int profit = 0;
        for (int i = 1; i < n; i++) {
            min = Math.min(min, prices[i]);

            profit = Math.max(profit, prices[i] - min);
        }

        return profit;
    }
}
