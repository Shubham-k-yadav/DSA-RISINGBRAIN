class Solution {
    public String minWindow(String s, String t) {
        int [] arr = new int[126];

        for(int i=0;i<t.length();i++)
        {
            arr[t.charAt(i)]++;
        }

        int i=0;
        int j=0;
        int count = t.length();
        int start = 0;
        int minLen = Integer.MAX_VALUE;


        for(j=0;j<s.length();j++)
        {
            char c = s.charAt(j);
            if(arr[c]>0)
            {
                count--;
            }
            arr[c]--;

            while(count == 0)
            {
                if(j-i+1 < minLen)
                {
                    minLen = j-i+1;
                    start = i;
                }

                char leftChar = s.charAt(i);
                arr[leftChar]++;

                if( arr[leftChar]>0)
                {
                    count++;
                }
                i++;
            }
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(start,start+minLen);
    }
}