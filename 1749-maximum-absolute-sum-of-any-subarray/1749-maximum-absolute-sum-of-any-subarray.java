class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int currSum1 = nums[0];
        int currSum2 = nums[0];
        int maxSum = nums[0];
        int minSum = nums[0];

        for(int i=1;i<nums.length;i++)
        {
            currSum1 = Math.max(nums[i],currSum1+nums[i]);
            currSum2 = Math.min(nums[i],currSum2+nums[i]);
            maxSum = Math.max(currSum1,maxSum);
            minSum = Math.min(currSum2,minSum);
        }
        
        return Math.max(maxSum,Math.abs(minSum));
    }
}