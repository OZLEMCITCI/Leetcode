package SlidingWindow;

import java.util.Arrays;
import java.util.OptionalInt;

public class BestTimeToBuyAndSellStock {

    public static void main(String[] args) {

        int[] price={7, 2, 5, 3,1, 6, 4};
       // System.out.println(maxProfit(price));
        System.out.println(minProfit(price));
    }

    public static int maxProfit(int[] prices) {

        int currentMax;
        int totalMax=0;

        for(int i=0;i<prices.length;i++){
            for(int j=i+1; j<prices.length;j++){
                currentMax=prices[j]-prices[i];

                totalMax=Math.max(totalMax,currentMax);

            }
        }

        if(totalMax>0){
            return totalMax;
        }else {
            return 0;
        }

    }

    public static int minProfit(int[] prices) {

        int minNumber=Integer.MAX_VALUE;
        int maxProfit=0;
        for (int price : prices) {
           minNumber=Math.min(price,minNumber);

           maxProfit = Math.max(maxProfit, price - minNumber);

        }

        return maxProfit;

    }
}
