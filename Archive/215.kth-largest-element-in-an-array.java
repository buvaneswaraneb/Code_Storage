/*
 * @lc app=leetcode id=215 lang=java
 *
 * [215] Kth Largest Element in an Array
 */

// @lc code=start

import java.util.PriorityQueue;

class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> Integer.compare(a,b));
        
        for (int i : nums){
            pq.offer(i);
            if (pq.size() > k) pq.poll();
        }
        return pq.poll();
    }
}
// @lc code=end

