class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int maxArea = 0;
        Set<String> visited = new HashSet<>();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1) {
                    int area = dfs(i,j,grid,visited);
                    maxArea = Math.max(maxArea, area);
                }
            }
        }

        return maxArea;
    }

    private int dfs(int i, int j, int[][] grid, Set<String> visited) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == 0 || visited.contains(i+","+j)) {
            return 0;
        }

        visited.add(i+","+j);
        return 
            1 + 
            dfs(i+1,j,grid,visited) + 
            dfs(i-1,j,grid,visited) + 
            dfs(i,j+1,grid,visited) + 
            dfs(i,j-1,grid,visited);
    }
}
