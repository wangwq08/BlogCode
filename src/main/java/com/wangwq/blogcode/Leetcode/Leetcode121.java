package com.wangwq.blogcode.Leetcode;

public class Leetcode121 {
    public static int maxProfit(int[] prices) {
        // 7 1 5 3 6 4
        int maxProfit = 0;
        int minNum = Integer.MAX_VALUE;
        for(int i = 0; i < prices.length; i++) {
            if(Integer.MAX_VALUE != minNum && prices[i] - minNum > maxProfit) {
                maxProfit = prices[i] - minNum;
            }

            if(prices[i] < minNum) {
                minNum = prices[i];
            }
            System.out.println(minNum + "  " + maxProfit);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = { 7, 1, 5, 3, 6, 4 };

        int maxProfit = maxProfit(prices);

        System.out.println(maxProfit);
    }
}
