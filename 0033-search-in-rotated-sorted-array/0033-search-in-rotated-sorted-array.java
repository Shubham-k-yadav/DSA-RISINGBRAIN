class Solution {
    public int search(int[] nums, int t) {
        int l = 0;
        int h = nums.length-1;

        while(l<=h)
        {
            int m = l+(h-l)/2;

            if(nums[m] == t)
            {
                return m;
            }

            else if(nums[l]<=nums[m])
            {
                if(nums[l]<=t && t<nums[m])
                {
                    h = m-1;
                }
                else
                {
                    l = m+1;
                }
            }
            else
            {
                if(nums[m]<t && t<=nums[h])
                {
                    l = m+1;
                }
                else
                {
                    h = m-1;
                }
            }
        }

        return -1;
    }
}