class Solution {
    public void moveZeroes(int[] nums) {
        //using fst and slow pointer pattern
        int s = 0;
        int f = 0;

        while (f < nums.length) {
            if (nums[f] != 0) {
                int temp = nums[s];
                nums[s] = nums[f];
                nums[f] = temp;
                s++;
            }
            f++;
        }
    }
}