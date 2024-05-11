class MaximumValue {
    public int maximumValue(String[] strs) {
        int max = Integer.MIN_VALUE;
        for(String str : strs) {
            /*if(s.matches("^[0-9]*$")) {
                max = Math.max(max, Integer.parseInt(s));
            } else {
                max = Math.max(max, s.length());
            }*/
            boolean isNumeric = true;
            for(int i = 0; i < str.length(); ++i) {
                if(!Character.isDigit(str.charAt(i))) {
                    isNumeric = false;
                    break;
                }
            }
            max = Math.max(max, isNumeric ? Integer.parseInt(str) : str.length());
        }
        return max;
    }
}
