
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.PriorityQueue;

/*
 * @lc app=leetcode id=743 lang=java
 *
 * [743] Network Delay Time
 */

// @lc code=start
class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {

        HashSet<Integer> visited = new HashSet<>();
        ArrayList<ArrayList<int[]>> adj_list = new ArrayList<>();

        for (int i = 0 ; i <= n ;i++) adj_list.add(new ArrayList<int[]>());

        int ans = Integer.MIN_VALUE;

        for(int[] time :times){
            int u = time[0];
            int v = time[1];
            int wt = time[2];
            adj_list.get(u).add(new int[]{wt,v});
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> Integer.compare(a[0],b[0]));

        pq.offer(new int[]{0,k});
        visited.add(k);

        while(!pq.isEmpty()){
            int[] curr = pq.poll();
            int curr_wt = curr[0];
            int curr_v = curr[1];
            ans = Math.max(ans, curr_wt);

            visited.add(curr_v);

            for (int[] neibour:adj_list.get(curr_v)){
                int neibour_v = neibour[1];
                int neibour_wt = neibour[0];

                if (!visited.contains(neibour_v))
                    pq.offer(new int[]{neibour_wt+curr_wt,neibour_v});
            }

        }

        System.out.print(ans+" "+visited);
        return visited.size() == n ? ans : -1;
    }
}
// @lc code=end

