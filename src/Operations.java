class Operations {
    public int finalValueAfterOperations(String[] operations) {
        int len = operations.length;
        int x = 0;
        for(int i = 0; i < len; i++) {
            switch(operations[i]) {
                case "x++":
                case "++x":
                case "X++":
                case "++X":
                    x = x + 1;
                    break;
                case "--x":
                case "x--":
                case "--X":
                case "X--":
                    x = x - 1;
                    break;
            }
        }
        return x;
    }
}
