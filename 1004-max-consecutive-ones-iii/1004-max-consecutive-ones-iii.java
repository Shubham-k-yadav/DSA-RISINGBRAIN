class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int zero = 0;
        int right = 0;

        while (right < nums.length) {
            if (nums[right] == 0)
            {
                zero++;
            }

            right++;

            if (zero > k) 
            {
                if (nums[left] == 0) 
                {
                    zero--;
                }

                left++;
            }
        }

        return right - left;
    }
}