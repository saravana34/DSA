class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<Boolean>();
        int len = candies.length;
        int max = -1;
        for(int i = 0; i < len; i++) {
            if(max < candies[i]) {
                max = candies[i];
            }
        }
        for(int i = 0; i < len; i++) {
            result.add(max <= (candies[i] + extraCandies));
        }
        return result;
    }
}
