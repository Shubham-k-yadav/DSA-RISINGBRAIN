class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int sum = 0;
        int curr = 0;
        int max =Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++)
        {
            curr = Math.max(nums[i],curr+nums[i]);
            max = Math.max(max,curr);
            sum += nums[i];
        }

        curr = 0;
        int min = Integer.MAX_VALUE;

        for(int i=0;i<nums.length;i++)
        {
            curr = Math.min(nums[i],curr+nums[i]);
            min = Math.min(min,curr);
        }

        if(sum == min)
        {
            return max;
        }
        return Math.max(max,sum-min);
        
    }
}