class Solution {
    public int trap(int[] nums) {
        int l = 0;
        int r = nums.length-1;
        int lmax = 0;
        int rmax = 0;
        int w = 0;
        while(l<r)
        {
            if(nums[l]<nums[r])
            {
                if(nums[l]>=lmax)
                {
                    lmax = nums[l];
                }
                else
                {
                    w += lmax - nums[l]; 
                }
                l++;
            }

            else
            {
                if(nums[r]>=rmax)
                {
                    rmax = nums[r];
                }
                else
                {
                    w += rmax - nums[r]; 
                }
                r--;
            }
        }
        return w;
    }
}