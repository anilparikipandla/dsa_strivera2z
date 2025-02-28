package com.arrays;

// LC 121: Best Time to Buy and Sell Stock

public class BestTimeToBuyStocks {

    public static void main(String[] args) {
        int[] inputArr = {7,1,5,3,6,4};
        int maxProfit = findMaxProfit(inputArr);
        System.out.println(maxProfit);
    }

    public static int findMaxProfit(int[] prices){
        int min = prices[0];
        int maxProfit = 0;
        for(int i = 1; i < prices.length; i++){
            int profit = prices[i] - min;
            maxProfit = Math.max(maxProfit, profit);
            min = Math.min(min, prices[i]);
        }
        return maxProfit;
    }

}
