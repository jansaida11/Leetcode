class Solution {
    public int maxProfit(int[] prices) {

        int low = prices[0];  
		int profit = 0;
		for(int i=1;i<prices.length;i++) {
			int temp = prices[i] - low;
			profit = Math.max(profit, temp);
			if(!(temp>=0)) {
				low = prices[i];
			}
		}
       
        return profit;

    }
}