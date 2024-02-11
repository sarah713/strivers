package practice;

import java.util.ArrayList;
import java.util.Arrays;

public class RatintheMaze {
    public static ArrayList<String> findPath(int[][] m, int n) {
        ArrayList<String> res = new ArrayList<>();
        int[][] visited = new int[n][n];
        for (int[] row : visited) {
            Arrays.fill(row, 0);
        }
        if (m[0][0] == 1) {
            dfs(m, visited, 0, 0, "", res, n);
        }
        return res;
    }

    public static void dfs(int[][] m, int[][] visited, int i, int j, String move, ArrayList<String> res, int n) {
        if (i == n - 1 && j == n - 1) {
            res.add(move);
            return;
        }
        // Downward
        if (i + 1 < n && visited[i + 1][j] == 0 && m[i + 1][j] == 1) {
            visited[i][j] = 1;
            dfs(m, visited, i + 1, j, move + "D", res, n);
            visited[i][j] = 0;
        }
        // LEFT
        if (j - 1 >= 0 && visited[i][j - 1] == 0 && m[i][j - 1] == 1) {
            visited[i][j] = 1;
            dfs(m, visited, i, j - 1, move + 'L', res, n);
            visited[i][j] = 0;
        }
        // Right
        if (j + 1 < n && visited[i][j + 1] == 0 && m[i][j + 1] == 1) {
            visited[i][j] = 1;
            dfs(m, visited, i, j + 1, move + 'R', res, n);
            visited[i][j] = 0;
        }
        // Upward
        if (i - 1 >= 0 && visited[i - 1][j] == 0 && m[i - 1][j] == 1) {
            visited[i][j] = 1;
            dfs(m, visited, i - 1, j, move + "U", res, n);
            visited[i][j] = 0;
        }

    }

}
