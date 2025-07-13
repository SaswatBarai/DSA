class Solution {
    public int maxProfit(int[] prices) {
        int pur = Integer.MIN_VALUE;
        int profit = 0;

        for (int val : prices) {
            if (val < pur) {
                pur = val;

            }

            profit = Math.max(profit,val-pur);
        }

        return profit;

    }
}