/*
 * @lc app=leetcode id=347 lang=java
 *
 * [347] Top K Frequent Elements
 */

// @lc code=start

import java.util.HashMap;
import java.util.PriorityQueue;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> map.get(a)-map.get(b));
        for (int i : nums) map.put(i,map.getOrDefault(i, 0)+1);
        for (int i: map.keySet()){
            pq.offer(i);
            if (pq.size()>k){
                pq.poll();
            }
        }
        int[] ans = new int[k];
        for (int i = 0 ; i < k; i++) ans[i] = pq.poll();

        return ans;
    }
}
// @lc code=end

