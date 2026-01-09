import java.util.*;
class BestTimeToBuyAndSellStock121 {
public static int maxProfit(int[]prices) {
    int currentProfit = 0;
    int maxProfit = 0;
    for(int i=1;i<prices.length;i++) {
        int diff = prices[i] - prices[i-1];
        currentProfit += diff;
        if(currentProfit<0){
            currentProfit=0;
        }
        if(currentProfit>maxProfit){
            maxProfit=currentProfit;
        }
    }
    return maxProfit;
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] prices = new int[n];
    for(int i=0;i<n;i++){
        prices[i]  = sc.nextInt();
    }
    int result = maxProfit(prices);
    System.out.println(result);
    sc.close();
}
}
