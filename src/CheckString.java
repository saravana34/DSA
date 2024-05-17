class CheckString {
    public boolean checkString(String s) {
        int ans = 1;
        for(int i=0; i<s.length()-1; i++){
            aif(s.charAt(i) == 'b' && s.charAt(i+1) == 'a'){
                ans = 0;
            }
        }
        return ans == 1;
    }
}
