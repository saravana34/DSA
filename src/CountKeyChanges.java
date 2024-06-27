class CountKeyChanges {
    public int countKeyChanges(String s) {
        s = s.toLowerCase();
        int count = 0;
        int n = s.length();
        for(int i=0;i<n-1;i++){
            if(s.charAt(i+1) != s.charAt(i)){
                count++;
            }
        }
        return count;
    }
}
