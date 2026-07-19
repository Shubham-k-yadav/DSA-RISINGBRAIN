class Solution {
    public int pivotIndex(int[] nums) {
        int []suml = new int[nums.length];
        suml[0] = nums[0];
        int []sumr = new int[nums.length];
        sumr[nums.length-1] = nums[nums.length-1];

        for(int i=1;i<nums.length;i++)
        {
            suml[i] = suml[i-1] + nums[i];
        }

        for(int i = nums.length-2;i>=0;i--)
        {
            sumr[i] = sumr[i+1] + nums[i];
        }

        for(int i = 0;i<nums.length;i++)
        {
            if(suml[i] == sumr[i]) return i;
        }
        return -1;
    }
}