class Solution {
     int count=0;
    public int maxAreaOfIsland(int[][] grid) {
       int max=0;

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j] == 1){
                    flood(i,j,grid);
                    max=Math.max(max,count);
                    count=0;
                }
            }
        }
        return max;
    }
    public void flood(int i,int j,int [][] grid){

        if(i < 0 || j < 0 || i>=grid.length || j>=grid[0].length)
        return;

        if(grid[i][j] ==0){
            return;
        }
        
            grid[i][j] =0;
            count++;
        flood(i+1, j, grid);
        flood(i-1, j, grid);
        flood(i, j+1, grid);
        flood(i, j-1, grid);
    }
}