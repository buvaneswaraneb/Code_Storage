/*
 * @lc app=leetcode id=547 lang=java
 *
 * [547] Number of Provinces
 */

// @lc code=start
class Solution {
    public int findCircleNum(int[][] isConnected) {
        int row = isConnected.length;
        boolean[] visited = new boolean[row];
        int count = 0 ;

        for (int i = 0; i < row; i++) {
            if(!visited[i]){
            count++;
            dfs(i, isConnected, visited);
            }
        }
        return count++;

    }

    private void dfs(int vertex , int[][] adj , boolean [] visited){

        visited[vertex] = true;
        for (int i = 0; i < adj.length ; i++){
            if (adj[vertex][i] == 1 && !visited[i]){
                dfs(i,adj,visited);
            }
        }
    }


}
// @lc code=end

