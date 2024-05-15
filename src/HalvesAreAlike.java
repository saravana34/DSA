class HalvesAreAlike {
    public boolean halvesAreAlike(String s) {
        int n = s.length();
        int l = 0, r = 0;
        for(int i = 0, j = (n / 2); i < n / 2 && j < n; i++, j++) {
            char c = Character.toLowerCase(s.charAt(i));
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                l++;

            char d = Character.toLowerCase(s.charAt(j));
            if(d == 'a' || d == 'e' || d == 'i' || d == 'o' || d == 'u')
                r++;
        }
        if(l == r)
            return true;
        return false;
    }
}
