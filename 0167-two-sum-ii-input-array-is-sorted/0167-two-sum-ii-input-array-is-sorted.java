class Solution {
    public int[] twoSum(int[] nums, int t) {
        //using two pinter opposite direction
        int []arr = new int[2];
        int l = 0;
        int r = nums.length-1;

        while(l<r)
        {
            if(nums[l]+nums[r] == t)
            {
                arr[0] = l+1;
                arr[1] = r+1;
                break;
            }
            if(nums[l]+nums[r] > t)
            {
                r--;
            }
            if(nums[l]+nums[r] < t)
            {
                l++;
            }
        }
        return arr;
    }
}