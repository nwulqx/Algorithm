class Solution {
   public:
    void sortColors(vector<int>& nums) {
        int n = nums.size();
        if (n < 2)
            return;
        //双指针
        int p = 0, q = n - 1;
        for (int i = 0; i <= q; ++i) {
            if (nums[i] == 0) {
                nums[i] = nums[p];
                nums[p] = 0;
                ++p;
            }
            // -- i 是回到当前 i 的位置，因为数已经置换过来，需判断一边置换来的是否为0.
            if (nums[i] == 2) {
                nums[i] = nums[q];
                nums[q] = 2;
                --q;
                if (nums[i] != 1)
                    --i;
            }
        }
        return;
    }
};