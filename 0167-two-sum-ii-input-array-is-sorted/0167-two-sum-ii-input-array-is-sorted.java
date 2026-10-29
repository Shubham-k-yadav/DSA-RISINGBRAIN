class Solution {
    public int[] twoSum(int[] nums, int t) {
        int n = nums.length;

        int i = 0;
        int j = n-1;

        int[]arr = new int[2];

        while(i<j)
        {
            if(nums[i]+nums[j] == t)
            {
                arr[0] = i+1;
                arr[1] = j+1;
                return arr;
            }
            else if(nums[i]+nums[j] > t)
            {
                j--;
            }
            else
            {
                i++;
            }
        }

        return arr;

    }
}