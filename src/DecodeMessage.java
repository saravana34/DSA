class DecodeMessage {
    public String decodeMessage(String key, String message) {
        Map<Character, Character> map = new HashMap<>();
        char a = 'a';
        for(char c : key.toCharArray()) {
            if(!map.containsKey(c) && c != ' ') {
                map.put(c, (char) a);
                a += 1;
            }
        }
        StringBuilder ans = new StringBuilder();
        for(char c : message.toCharArray()) {
            if(c != ' ') {
                ans.append(Character.toString(map.get(c)));
            } else {
                ans.append(" ");
            }
        }
        return ans.toString();
    }
}
