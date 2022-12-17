public class BuySellStock {

    static int maxProfit(int[] prices, int n){
        if (n<2) return 0;
        int sell=0,buy=0,profit=0;
        for (int i = 1; i < n; i++) {
            if (prices[i]>=prices[i-1]) {
                sell++;
            }else{
                profit += (prices[sell]-prices[buy]);
                        sell = buy = i;
            }
        }
        profit += (prices[sell]-prices[buy]);
        return profit;
    }
    public static void main(String[] args)
    {
        int[] prices = { 7, 1, 5, 3, 6, 4 };
        int ans = maxProfit(prices, prices.length);
        System.out.print(ans);
    }
}
