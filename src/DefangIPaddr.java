class DefangIPaddr {
    public String defangIPaddr(String address) {
        if(address == null || address.isEmpty()) {
            return "";
        }
        StringBuilder res = new StringBuilder();
        for(char ch : address.toCharArray()) {
            if(ch == '.') {
                res.append("[.]");
            } else {
                 res.append(ch);
            }
        }
        return res.toString();
    }
}
