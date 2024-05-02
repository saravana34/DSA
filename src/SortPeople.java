class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int len = names.length;
        String[] ppl = new String[len];
        Map<Integer, String> map = new HashMap<Integer, String>();
        for(int i = 0; i < len; i++) {
            map.put(heights[i], names[i]);
        }
        Arrays.sort(heights);
        /*ArrayList<Integer> sortedKeys = new ArrayList<>(map.keySet());
        Collections.sort(sortedKeys);
        int i = len - 1;
        for(Integer x : sortedKeys) {
            ppl[i--] = map.get(x);
        }*/
        int k = 0;
        for(int i = heights.length - 1; i >= 0; i--) {
            ppl[k++] = map.get(heights[i]);         
        }
        return ppl;
    }
}
