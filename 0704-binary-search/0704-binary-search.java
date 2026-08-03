class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        int mid = left + (right - left) / 2;

        int ans = binarySearch(left, right, mid, nums, target);
        return ans;
    }

    public int binarySearch(int left, int right, int mid, int[] nums, int target) {
        if (left > right) {
            return -1;
        }
        if (nums[mid] == target)
            return mid;

        else if (target > nums[mid]) {
            left = mid + 1;
        }

        else {
            right = mid - 1;
        }

        mid = left + (right - left) / 2;
        return binarySearch(left, right, mid, nums, target);
    }
}