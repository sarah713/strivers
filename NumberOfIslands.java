public class NumberOfIslands {
    public int numIslands(char[][] grid) {
        int num = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    num += 1;
                    helper(grid, i, j, grid.length, grid[0].length);
                }
            }
        }
        return num;
    }

    public void helper(char[][] grid, int i, int j, int m, int n) {
        if (i < 0 || i >= m || j < 0 || j >= n || grid[i][j] == '0') {
            return;
        }

        grid[i][j] = '0';
        helper(grid, i + 1, j, m, n);
        helper(grid, i - 1, j, m, n);
        helper(grid, i, j + 1, m, n);
        helper(grid, i, j - 1, m, n);
    }
}
