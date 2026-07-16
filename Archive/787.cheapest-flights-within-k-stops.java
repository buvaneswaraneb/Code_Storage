/*
 * @lc app=leetcode id=787 lang=java
 *
 * [787] Cheapest Flights Within K Stops
 */

// @lc code=start

import java.util.ArrayList;
import java.util.HashSet;
import java.util.PriorityQueue;

class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        

        // ans variable
        int ans = Integer.MIN_VALUE;

        // adjList 
        ArrayList<ArrayList<int[]>> adj_list = new ArrayList<>();
        for (int i = 0; i < n ; i++) adj_list.add(new ArrayList<>());

        // visited set 
        HashSet<Integer> visited = new HashSet<>();

        //build adj_list 

        for (int[] flight : flights){
            int flight_u = flight[0];
            int flight_v = flight[1];
            int flight_wt = flight[2];
            adj_list.get(flight_u).add(new int[]{flight_wt,flight_v});
        }
        // priority Queue
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> Integer.compare(a[0],b[0]));

        pq.offer(new int[]{0,src,k});

        while(!pq.isEmpty()){
            int[] curr = pq.poll();
            int curr_wt = curr[0];
            int curr_v = curr[1];
            int curr_k = curr[2];

            if (curr_k <= 0 || visited.contains(curr_v)) continue;
            ans = Math.max(ans,curr_wt);
            visited.add(curr_v);
            if (curr_v == dst) break;

            for(int[] neibour : adj_list.get(curr_v)){
                int neibour_wt = neibour[0];
                int neibour_v = neibour[1];

                int new_weight = curr_wt + neibour_wt;
                if (!visited.contains(neibour_v)){
                    pq.offer(new int[] {new_weight, neibour_v, curr_k-1});
                }
            }   
        }
        return ans;
    }
}
// @lc code=end

