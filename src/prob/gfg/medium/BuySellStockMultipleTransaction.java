package prob.gfg.medium;

public class BuySellStockMultipleTransaction {
    public static void main(String[] args) {
        int[] prices = {100, 180, 260, 310, 40, 535, 695};
        System.out.println(maximumProfit(prices));
    }

    static int maximumProfit(int[] prices) {
        int n = prices.length;
        int buy = prices[0];
        int sell = prices[0];
        int res = 0;

        int i = 0;
        while (i < n - 1) {

            while (i < n - 1 && prices[i] >= prices[i + 1]) { i++; }
            buy = prices[i];

            while (i < n - 1 && prices[i] <= prices[i + 1]) { i++; }
            sell = prices[i];

            res += (sell - buy);
        }

        return res;
    }
}
