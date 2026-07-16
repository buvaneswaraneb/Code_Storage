/*
 * @lc app=leetcode id=152 lang=java
 *
 * [152] Maximum Product Subarray
 */

// @lc code=start
class Solution {
    public int maxProduct(int[] nums) {
        int suf = 1;
        int pre = 1 ;
        int max = Integer.MIN_VALUE;
        int end = nums.length-1;
        for (int i = 0; i < nums.length; i++) {
            pre *= nums[i];
            suf *= nums[end-i];
            max = Math.max(max,Math.max(pre,suf));
        }
        return max;
    }
}
// @lc code=end
