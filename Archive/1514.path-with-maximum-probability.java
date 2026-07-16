/*
 * @lc app=leetcode id=1514 lang=java
 *
 * [1514] Path with Maximum Probability
 */

// @lc code=start

import java.util.Arrays;
import java.util.PriorityQueue;

class Solution {
    public double maxProbability(int n, int[][] edges, double[] succProb, int start_node, int end_node) {
        
        // adj list 
        ArrayList<ArrayList<double[]>> adj_list = new ArrayList<>();
        for (int i = 0 ; i < n ; i++) adj_list.add(new ArrayList<>());

        // dist lis t
        double[] dist = new double[n];
        Arrays.fill(dist,Double.MIN_VALUE);

        // build adj list 
        for (int i = 0; i < edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            double p = succProb[i];

            adj_list.get(u).add(new double[]{v, p});
            adj_list.get(v).add(new double[]{u, p});
        }

        // build priority Queue
        PriorityQueue<double[]> pq = new PriorityQueue<>((a,b) -> Double.compare(a[0],b[0])); 

        pq.offer(new double[]{1.0,start_node});
        dist[start_node] = 1.0;

        while (!pq.isEmpty()) {
            double[] curr = pq.poll();
            double curr_wt = curr[0];
            double curr_u = curr[1];
            if (dist[(int)curr_u] > curr_wt) continue;

            for (double[] neibour: adj_list.get((int)curr_u)){
                int neibour_v = (int)neibour[1];
                double neibour_wt = neibour[0];
                double new_weight = neibour_wt * curr_wt;

                if (dist[neibour_v] < neibour_wt){
                    pq.offer(new double[]{new_weight,neibour_v});
                    dist[neibour_v] = new_weight;
                }
            }

        }
        return 2.3;
        
    }
}
// @lc code=end

