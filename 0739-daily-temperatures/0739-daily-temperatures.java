class Solution {
    public int[] dailyTemperatures(int[] nums) {

        Stack<Integer> st = new Stack<>();

        int[] ans = new int[nums.length];

        for(int i=0;i<nums.length;i++)
        {
            while (!st.isEmpty() && nums[i] > nums[st.peek()]) {

            int prevIndex = st.pop();

            ans[prevIndex] = i - prevIndex;
        }

        st.push(i);
        }

        return ans;
    }
}