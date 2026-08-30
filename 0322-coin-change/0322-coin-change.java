class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] way = new int[amount+1];
        Arrays.fill(way, amount+1);
        way[0] = 0;
        for(int i=1; i<=amount; i++) {
            for(int coin: coins) {
                if(coin<=i) {
                    way[i]=Math.min(way[i], way[i-coin]+1);
                }
            }
        }
        return way[amount]> amount? -1: way[amount];
    }
}