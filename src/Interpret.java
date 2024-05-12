class Interpret {
    public String interpret(String command) {
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < command.length(); i++) {
            char ch = command.charAt(i);
            if(ch == 'G') {
                res.append("G");
            } else if(ch == '(' && command.charAt(i + 1) == ')') {
                res.append("o");
                i++;
            } else if(ch == '(' && command.charAt(i + 1) == 'a') {
                res.append("al");
                i = i + 3;
            }
        }
        return res.toString();
    }
}
