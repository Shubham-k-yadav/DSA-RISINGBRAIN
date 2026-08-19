class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        int idx = binarySearch(nums, left, right, target);
        return idx;

    }

    public int binarySearch(int [] nums,int left,int right,int target)
    {
        if(left>right) return  left;
        int mid = left+((right-left)/2);

        if(nums[mid]==target)
        {
            return mid;
        }
        else if(nums[mid] > target)
        {
           return binarySearch(nums,left,mid-1,target);
        }
        else 
        {
            return binarySearch(nums,mid+1,right,target);
        }
    }
}