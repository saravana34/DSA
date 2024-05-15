class RemoveTrailingZeros {
    public String removeTrailingZeros(String num) {
        int count = 0;
        int len = num.length();
        for(int i = len - 1; i >= 0; i--) {
            if(num.charAt(i) == '0') {
                count++;
            } else {
                break;
            }
        }
        return num.substring(0, len - count);
    }
}
