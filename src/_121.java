public class _121 {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = 0;
        int n = prices.length;
        for(int i =0;i<n;i++){
            if(prices[i]<min){
                min = prices[i];
            }else if(prices[i]-min>max){
                max = prices[i] - min;
            }

        }
        return max;
    }
}
