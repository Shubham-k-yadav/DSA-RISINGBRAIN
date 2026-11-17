class Solution {
    public int majorityElement(int[] nums) {
        
        int maxE = nums[0];
        
        int count = 0;

        for(int i=0;i<nums.length;i++)
        {
            
            if(nums[i] == maxE)
            {
                count++;
            }
            else
            {
                count--;
                if(count == 0)
                {
                    maxE = nums[i];
                    count = 1;
                }
            }
        }

        return maxE;

    }
}