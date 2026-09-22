class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int largest = 0;
        for(int candy:candies) {
            if(largest<candy) largest=candy;
        }
        List<Boolean> result = new ArrayList();
        for(int i=0;i<candies.length;i++) {
            if((candies[i]+extraCandies)>=largest) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        return result;
    }
}