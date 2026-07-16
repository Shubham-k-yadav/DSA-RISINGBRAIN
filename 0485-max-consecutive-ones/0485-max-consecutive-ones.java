class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int currMax = 0;
        int start =0;

        for(int end = 0;end<nums.length;end++)
        {
            if(nums[end] != 0)
            {
                currMax++;
            }
            else
            {
                max = Math.max(max,currMax);
                currMax = 0;
            }
        }
        max = Math.max(max,currMax);
        return max;
    }
}