
import java.util.LinkedList;
import java.util.Queue;

/*
 * @lc app=leetcode id=200 lang=java
 *
 * [200] Number of Islands
 */

// @lc code=start
class Solution {
    public int numIslands(char[][] grid) {

        int row = grid.length;
        int col = grid[0].length;

        int count = 0;

        int[][] directions = { {-1,0},{1,0},{0,-1},{0,1} };


        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

                if (grid[i][j] == '1'){
                    count++;
                    Queue<int[]> q = new LinkedList<>();
                    q.offer(new int[]{i,j});
                    grid[i][j] = '0';

                    while(!q.isEmpty()){

                        int[] dict = q.poll();

                        int r = dict[0];
                        int c = dict[1];

                        for (int[] d : directions){

                            int newRow = r + d[0];
                            int newCol = c + d[1];

                            if (newRow >= 0 && newRow < grid.length &&
                                newCol >= 0 && newCol < grid[0].length &&
                                grid[newRow][newCol] == '1'){
                                    grid[newRow][newCol] = '0';
                                    q.offer(new int[]{newRow,newCol});
                                }
                        }

                        }

                }
                
            }
            
        }

        return count;
    }
}
// @lc code=end

