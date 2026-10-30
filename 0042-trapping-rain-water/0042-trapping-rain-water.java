class Solution {
    public int trap(int[] nums) {
        int l = 0;
        int r = nums.length-1;


        int leftMax = 0;
        int rightMax = 0;

        int ans = 0;

        while(l<r)
        {
            if(nums[l]<nums[r])
            {
                if(nums[l]>=leftMax)
                {
                    leftMax = nums[l];
                }
                else
                {
                    ans += leftMax-nums[l];
                }
                l++;
            }


            else
            {
                if(nums[r]>=rightMax)
                {
                    rightMax = nums[r];
                }
                else
                {
                    ans += rightMax-nums[r];
                }
                r--;
            }
        }
        return ans;

    }
}