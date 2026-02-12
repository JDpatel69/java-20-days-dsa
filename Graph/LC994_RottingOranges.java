class Solution {
    int fresh = 0;

    public int orangesRotting(int[][] grid) {
        int minutes = 0;
        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 2) {
                    q.add(i);
                    q.add(j);
                }
                if (grid[i][j] == 1) {
                    fresh++;
                }
            }
        }

        while (!q.isEmpty() && fresh > 0) {
            int size = q.size() / 2; 
            
            for (int s = 0; s < size; s++) {
                int i = q.remove();
                int j = q.remove();
                rot(i, j, q, grid);
            }
            minutes++;
        }

        return fresh == 0 ? minutes : -1;
    }

    public void rot(int i, int j, Queue<Integer> q, int[][] grid) {

        if (i + 1 < grid.length && grid[i + 1][j] == 1) {
            grid[i + 1][j] = 2;
            q.add(i + 1);
            q.add(j);
            fresh--;
        }

        if (j + 1 < grid[0].length && grid[i][j + 1] == 1) {
            grid[i][j + 1] = 2;
            q.add(i);
            q.add(j + 1);
            fresh--;
        }

        if (i - 1 >= 0 && grid[i - 1][j] == 1) {
            grid[i - 1][j] = 2;
            q.add(i - 1);
            q.add(j);
            fresh--;
        }

        if (j - 1 >= 0 && grid[i][j - 1] == 1) {
            grid[i][j - 1] = 2;
            q.add(i);
            q.add(j - 1);
            fresh--;
        }
    }
}
