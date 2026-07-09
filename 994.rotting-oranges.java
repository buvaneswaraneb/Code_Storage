
import java.util.*;

/*
 * @lc app=leetcode id=994 lang=java
 *
 * [994] Rotting Oranges
 */

// @lc code=start
class Solution {
    public int orangesRotting(int[][] grid) {

        int minutes = 0;
        int fresh = 0;

        Queue<int[]> q = new LinkedList<>();

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 2) q.offer(new int[]{i,j});
                if (grid[i][j]== 1 ) fresh++;
            }
        }

        int[][] direction = {
                {-1, 0},  // up
                {1, 0},  //down 
                {0, -1}, //left
                {0 , 1} //right
                };

        while (!q.isEmpty()){
            int size = q.size();

            for (int i = 0; i < size; i++) {

                int[] index = q.poll();
                int r = index[0];
                int c = index[1];

                for (int[] d : direction){
                    int newRow = r + d[0];
                    int newCol = c + d[1];

                    if (newRow >= 0 && newRow < grid.length &&
                        newCol >= 0 && newCol < grid[0].length &&
                        grid[newRow][newCol] == 1){

                            grid[newRow][newCol] = 2;
                            fresh-- ;
                            q.offer(new int[]{newRow, newCol});
                    }
                }
            }
                if (!q.isEmpty())
                    minutes++;
        }
        return  fresh == 0 ? minutes : -1;
    }
}
// @lc code=end

