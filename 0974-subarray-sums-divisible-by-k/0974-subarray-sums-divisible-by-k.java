class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int[] sum = new int [nums.length];
        sum[0] = nums[0];
        int ans = 0;

        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
       
        for (int i = 1; i < nums.length; i++) {
            sum[i] = sum[i-1] + nums[i];
        }

        for(int i=0;i<nums.length;i++)
        {
            sum[i] = ((sum[i] % k) + k) % k;
        }

        

        for(int i=0;i<nums.length;i++)
        {
            if(!map.containsKey(sum[i]))
            {
                map.put(sum[i],0);
            }
            ans += map.get(sum[i]);
            map.put(sum[i],map.getOrDefault(sum[i],0)+1);
            
        }

        return ans;
    }
}