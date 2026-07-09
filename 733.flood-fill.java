/*
 * @lc app=leetcode id=733 lang=java
 *
 * [733] Flood Fill
 */

// @lc code=start

import java.util.*;

class Solution {
    public int[][] floodFill(int[][] grid, int sr, int sc, int color) {

       int[][] directions = { {-1,0},{1,0},{0,-1},{0,1} };

       int target = grid[sr][sc];

       if (target == color) return grid;

       Queue<int[]> q = new LinkedList<>();

       q.offer(new int[]{sr,sc});

       while(!q.isEmpty()){

        int[] index = q.poll();

        int r = index[0];
        int c = index[1];

        for (int[] d : directions){

        int newRow = r + d[0];
        int newCol = c + d[1];

        if (newRow >= 0 && newRow < grid.length &&
            newCol >= 0 && newCol < grid[0].length &&
                grid[newRow][newCol] == target){
                grid[newRow][newCol] = color;
                q.offer(new int[]{newRow,newCol});
            }
        }

       }

       return grid;

    }
}
// @lc code=end

