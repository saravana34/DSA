class SortPeople {
    public String[] sortPeople(String[] names, int[] heights) {
        int len = names.length;
        String[] ppl = new String[len];
        Map<Integer, String> map = new HashMap<Integer, String>();
        for(int i = 0; i < len; i++) {
            map.put(heights[i], names[i]);
        }
        ArrayList<Integer> sortedKeys = new ArrayList<>(map.keySet());
        Collections.sort(sortedKeys);
        int i = len - 1;
        for(Integer x : sortedKeys) {
            ppl[i--] = map.get(x);
        }
        return ppl;
    }
}
