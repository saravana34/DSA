class CheckDistances {
    public boolean checkDistances(String s, int[] distance) {
        int[] arr1 = new int[26];
        Arrays.fill(arr1, -1);
        int[] arr2 = new int[26];
        Arrays.fill(arr2, -1);
        int len = s.length();
        for(int i = 0; i < len; i++) {
            if(arr1[s.charAt(i) - 'a'] != -1) {
                arr2[s.charAt(i) - 'a'] = i;
            } else {
                arr1[s.charAt(i) - 'a'] = i;
            }
        }
        for(int i = 0;  i < 26; i++) {
            if(arr1[i] != -1 && arr2[i] - arr1[i] - 1 != distance[i]) {
                return false;
            }
        }
        return true;
    }
}
