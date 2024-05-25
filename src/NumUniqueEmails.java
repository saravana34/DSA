class NumUniqueEmails {
    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        int count = 0;
        for(String email : emails) {
            int atIndex = email.indexOf("@");
            int plusIndex = email.indexOf("+");
            String str = "";
            if(plusIndex >= 0) {
                str = email.substring(0, plusIndex);
            } else {
                str = email.substring(0, atIndex);
            }
            str = str.replace(".", "") + email.substring(atIndex);
            if(set.add(str)) {
                count++;
            }
        }
        return count;
    }
}
