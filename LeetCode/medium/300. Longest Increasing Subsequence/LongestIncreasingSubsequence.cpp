class Solution {
   public:
    int lengthOfLIS(vector<int>& nums) {
        int len = nums.size();
        if (len == 0) {
            return 0;
        }
        vector<int> dp(len, 0);
        int res = -1;
        for (int i = 0; i < len; ++i) {
            dp[i] = 1;
            for (int j = 0; j < i; ++j) {
                if (nums[j] < nums[i]) {
                    dp[i] = max(dp[i], dp[j] + 1);
                }
            }
            res = max(res, dp[i]);
        }
        return res;
    }
};