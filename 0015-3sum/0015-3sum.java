class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int x= 0;
        List<List<Integer>> list = new ArrayList<>();
        while(x<=nums.length-3)
        {
            if(x>0 && nums[x] ==nums[x-1]) {
                x++ ;
                continue; //ye dubar se duplicate element ko check karne ke liye hai;
            }
            int y = x+1;
            int z = nums.length-1;

            while(y<z)
            {
                
                if(nums[x]+nums[y]+nums[z] == 0)
                {
                    
                    list.add(Arrays.asList(nums[x], nums[y], nums[z]));
                    
                    y++;
                    z--;

                    while(y<z && nums[y] == nums[y-1]) y++;
                    while(y<z && nums[z] == nums[z+1]) z--;
                }
                else if(nums[x]+nums[y]+nums[z] > 0)
                {
                    z--;
                }
                else
                {
                    y++;
                }
            }
            x++;
        }
        return list;
    }
}