class Solution {
    public int lengthOfLongestSubstring(String s) {
        int count[] = new int[128];

        int i = 0;
        int j = 0;
        int max = 0;

        while(i<s.length())
        {
            j = Math.max(j,count[s.charAt(i)]);

            count[s.charAt(i)] = i+1;

            max = Math.max(max,i-j+1);

            i++;
        }
        return max;
    }
}