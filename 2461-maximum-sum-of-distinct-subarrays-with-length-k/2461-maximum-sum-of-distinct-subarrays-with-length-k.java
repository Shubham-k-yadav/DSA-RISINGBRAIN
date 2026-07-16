class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long max = 0;
        long windowSum = 0;
        int start = 0;
        Set<Integer> set = new HashSet<>();
        
        for(int end=0;end<nums.length;end++)
        {
            if(!set.contains(nums[end]))
            {
                windowSum += nums[end];
                set.add(nums[end]);

                if(end-start+1 == k)
                {
                    max = Math.max(max,windowSum);
                    windowSum -= nums[start];
                    set.remove(nums[start]);
                    start++;
                }
            }

            else
            {
                while(nums[start] != nums[end])
                {
                    windowSum -= nums[start];
                    set.remove(nums[start]);
                    start++;
                }
                start++;
            }
        }
        return max;
    }
}