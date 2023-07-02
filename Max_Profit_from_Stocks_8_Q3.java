public class Max_Profit_from_Stocks_8_Q3 {
    // my method
    private static int maxProfit(int[] prices) {
        int buyPrice = prices[0];
        int index = 0;
        int maxProfit = Integer.MIN_VALUE;
        for (int i = 1; i < prices.length; i++) {
            if (buyPrice > prices[i]) {
                buyPrice = prices[i];
                index = i;
            }
        }
        for (int i = index; i < prices.length; i++) {
            int profit = prices[i] - buyPrice;
            maxProfit = Math.max(profit, maxProfit);
        }
        if (maxProfit > 0) {
            return maxProfit;
        } else {
            return 0;
        }
    }

    // optimized program
    public static int profitFromBuyAndSell(int prices[]) {
        int buyPrice = Integer.MAX_VALUE;
        int profit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (buyPrice < prices[i]) {
                profit = Math.max(prices[i] - buyPrice, profit);
            } else {
                buyPrice = prices[i];
            }
        }
        return profit;
    }

    public static void main(String args[]) {
        int prices1[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println(maxProfit(prices1));
        System.out.println(profitFromBuyAndSell(prices1));
        int prices2[] = { 7, 6, 4, 3, 1 };
        System.out.println(maxProfit(prices2));
        System.out.println(profitFromBuyAndSell(prices2));
    }
}