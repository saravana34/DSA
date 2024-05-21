class MinimizedStringLength {
    public int minimizedStringLength(String s) {
        /*Map<Integer, Integer> map = new HashMap<>();
        int len = s.length();
        for(int i = 0; i < len; i++) {
            int charIndex = (int)(s.charAt(i));
            map.put(charIndex, map.getOrDefault(charIndex, 0) + 1);
        }
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < len; i++) {
            int charIndex = (int)(s.charAt(i));
            if(map.get(charIndex) > 1) {
                res.append(s.charAt(i));
                map.put(charIndex, 0);
            } else if(map.get(charIndex) != 0) {
                res.append(s.charAt(i));
            }
        }
        return res.length();*/
        char[] chars = s.toCharArray();
        int[] counts = new int[26];
        int result =0;
        for(char c: chars){
            counts[c-'a']++;
        }
        for(int i:counts){
            if(i>0){
                result++;
            }
        }
        return result;
    }
}
