class WordExist {
    public boolean exist(char[][] board, String word) {
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {
                if(board[i][j] == word.charAt(0) && DFS(board, i, j, word, 0)) {
                    return true;
                }
            }
        }
        return false;
    }
    boolean DFS(char[][] board, int i, int j, String word, int index) {
        if(index == word.length()) {
            return true;
        }
        if(i < 0 || j < 0 || i >= board.length || j >= board[0].length || word.charAt(index) != board[i][j]){
            return false;
        }
        char ch = word.charAt(index);
        board[i][j] = '#';
        boolean found = DFS(board, i + 1, j, word, index + 1) || 
                        DFS(board, i - 1, j, word, index + 1) ||
                        DFS(board, i, j + 1, word, index + 1) ||
                        DFS(board, i, j - 1, word, index + 1);

        board[i][j] = ch;
        return found;

    }
}
