class Pangram {
    public boolean checkIfPangram(String str) {
        boolean[] test = new boolean[26];
        int index = 0;
        for(int i = 0; i < str.length(); i++) {
            if('A' <= str.charAt(i) && str.charAt(i) <= 'Z') {
                index = str.charAt(i) - 'A';
            } else if('a' <= str.charAt(i) && str.charAt(i) <= 'z') {
                index = str.charAt(i) - 'a';
            } else {
                continue;
            }
            test[index] = true;
        }
        for (int i = 0; i <= 25; i++){
            if (test[i] == false) {
                return false;
            }
        }
        return true;
    }
}
