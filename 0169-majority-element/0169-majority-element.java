class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int a = Integer.MIN_VALUE;
        int ans = 0;

        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            if(map.get(nums[i]) > a)
            {
                a = map.get(nums[i]);
                ans = nums[i];
            }
        }

        return ans;

    }
}