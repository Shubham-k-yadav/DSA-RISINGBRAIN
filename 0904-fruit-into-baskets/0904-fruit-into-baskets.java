class Solution {
    public int totalFruit(int[] nums) {
        int left = 0;
        int right = 0;
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;

        while (right < nums.length && left < nums.length) {
            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);

            while (map.size() > 2) {
                map.put(nums[left], map.get(nums[left]) - 1);

                if (map.get(nums[left]) == 0) {
                    map.remove(nums[left]);
                }
                left++;
            }
            max = Math.max(max, right - left + 1);
            right++;
        }

        return max;

    }
}