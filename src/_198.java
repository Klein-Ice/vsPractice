public class _198 {
    // 打家劫舍
    public int rob(int[] nums) {
        int max = 0;
        int n = nums.length;
        int[] dp = new int[n];
        dp[0] = nums[0];
        if (n == 1)
            return nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        max = dp[1];

        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(nums[i] + dp[i - 2], dp[i - 1]);
            max = Math.max(max, dp[i]);
        }
        return max;
    }
}
