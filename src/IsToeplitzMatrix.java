class IsToeplitzMatrix {
    public boolean isToeplitzMatrix(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                int prev = matrix[i][j];
                int k = 0;
                while(i + k < matrix.length && j + k < matrix[0].length) {
                    if(prev != matrix[i + k][j + k]) {
                        return false;
                    }
                    k++;
                }
            }
        }
        return true;
    }
}
