class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int l = 0, r = 0;
        int zeros = 0, maxlength = 0;

        while (r < n) {
            if (nums[r] == 0) {
                zeros++;
            }
            r++;

            while (zeros > k) {
                if (nums[l] == 0) {
                    zeros--;
                }
                l++;
            }

            maxlength = Math.max(maxlength, r - l);
        }
        return maxlength;
    }
}