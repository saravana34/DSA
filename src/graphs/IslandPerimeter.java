class IslandPerimeter {
    public int islandPerimeter(int[][] grid) {
        int perimeter = 0;
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length;j++) {
                perimeter += func(grid, i, j);
            }
        }
        return perimeter;
    }
    int func(int[][] grid, int i, int j) {
        if(grid[i][j] == 0) {
            return 0;
        }
        int r = grid.length;
        int c = grid[0].length;
        int edge = 0;
        if(i == 0 || grid[i-1][j] == 0) {
            edge++;
        }
        if(i == r - 1 || grid[i + 1][j] == 0) {
            edge++;
        }
        if(j == 0 || grid[i][j - 1] == 0) {
            edge++;
        }
        if(j == c - 1 || grid[i][j+1] == 0) {
            edge++;
        }
        return edge;
    }
}
