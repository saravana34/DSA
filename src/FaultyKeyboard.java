class FaultyKeyboard {
    public String finalString(String s) {
        int len = s.length();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < len; i++) {
            if(s.charAt(i) == 'i') {
                sb.reverse();
            } else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
