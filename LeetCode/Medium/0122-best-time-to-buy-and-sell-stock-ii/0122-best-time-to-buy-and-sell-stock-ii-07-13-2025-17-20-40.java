class Solution {
    public int maxProfit(int[] prices) {
        int pur =Integer.MAX_VALUE;
        int profit = 0;
        int mainProfit = 0;
        int sell = 0;
        int i =0;

        for(int val : prices){

            if(sell ==1){
                sell = 0;
                mainProfit = profit + mainProfit;
                profit = 0;
            }

            if(val < pur){
                pur = val;
            }

            if(profit < val-pur){
                int j = i;
                profit = val-pur;
                j= j+1;
                if(j < prices.length && prices[j]<=val){
                    pur =Integer.MAX_VALUE;
                    sell = 1;
                }
            }
            i++;
        }
        mainProfit= mainProfit + profit;

        

        return mainProfit;
    }
}