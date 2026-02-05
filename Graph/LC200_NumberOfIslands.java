class Solution {

    public int numIslands(char[][] grid) {

        int count = 0;

        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){

                if(grid[i][j] == '1'){
                    count++;
                    flood(i, j, grid);
                }
            }
        }

        return count;
    }

    public void flood(int i, int j, char[][] grid){

        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length)
            return;

        if(grid[i][j] == '0')
            return;

        grid[i][j] = '0';


        flood(i+1, j, grid);
        flood(i-1, j, grid);
        flood(i, j+1, grid);
        flood(i, j-1, grid);
    }
}
