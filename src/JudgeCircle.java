class JudgeCircle {
    public boolean judgeCircle(String moves) {
        int up = 0, down = 0, left = 0, right = 0;
        char[] ch = moves.toCharArray();
        for(char k : ch) {
            switch(k) {
                case 'U':
                    up++;
                    break;
                case 'D':
                    down++;
                    break;
                case 'L':
                    left++;
                    break;
                case 'R':
                    right++;
                    break;
            }
        }  
        return left == right && up == down; 
    }
}
