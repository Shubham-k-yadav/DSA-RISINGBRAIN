class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map = new HashMap<>();
        Stack<Integer> s = new Stack<>();

        for(int i=0;i<nums2.length;i++)
        {
            while(!s.isEmpty()  && s.peek() < nums2[i])
            {
                map.put(s.pop(),nums2[i]);
            }
            s.push(nums2[i]);
        }
        int [] result = new int[nums1.length];
         for(int i=0;i<nums1.length;i++)
        {
            result[i] = map.getOrDefault(nums1[i], -1);
        }
        return result;
    }
}