class SortSentence {
    public String sortSentence(String s) {
        String[] str = s.split(" ");
        String[] r = new String[str.length];
        int i = 0;
        for(String ele : str) {
            i = (int) (ele.charAt(ele.length() - 1) - '0');
            r[i - 1] = ele.substring(0, ele.length() - 1);
        }
        StringBuilder res = new StringBuilder();
        for(i = 0; i < r.length; i++) {
            res.append(r[i]);
            res.append(" ");
        }
        return res.toString().trim();
    }
}
