package org.example.best_time_to_buy_and_sell_stock;

public class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

        for(int i = 0; i<prices.length; i++) {
            min = Math.min(min, prices[i]);
            max = Math.max(max, prices[i]-min);
        }


        return Math.max(max, 0);
    }
}
