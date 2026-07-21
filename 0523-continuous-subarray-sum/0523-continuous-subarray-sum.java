class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int[] sum = new int [nums.length];
        sum[0] = nums[0];

        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);

        for (int i = 1; i < nums.length; i++) {
            sum[i] = sum[i-1] + nums[i];
        }


        for(int i=0;i<nums.length;i++)
        {
            sum[i] = sum[i]%k;
        }

        for(int i=0;i<nums.length;i++)
        {
             if(!map.containsKey(sum[i]))
            {
                map.put(sum[i],i);
            }

            else
            {
               if((i - map.get(sum[i])) >=2)
               {
                return true;
               }
            }
        }

        return false;

    }
}