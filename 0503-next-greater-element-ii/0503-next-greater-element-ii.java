class Solution {
    public int[] nextGreaterElements(int[] nums) {

        Stack<Integer> st = new Stack<>();

        for(int i=nums.length-1;i>=0;i--)
        {
            st.push(nums[i]);           
        }

        for(int i = nums.length-1;i>=0;i--)
        {
            while(!st.isEmpty() && st.peek()<=nums[i])
            {
                st.pop();
            }

            int curr = nums[i];

            if(st.size() == 0)
            {
                nums[i] = -1;
            }
            else
            {
                nums[i] = st.peek();
            }

            st.push(curr);
        }
        return nums;
    }
}