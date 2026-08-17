class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int []s1count = new int[26];
        int []s2count = new int[26];

        for(int k=0;k<s1.length();k++)
        {
            s1count[s1.charAt(k)-'a']++;
        }

        int j=0;
        int i=0;
        while(j<s2.length())
        {
            s2count[s2.charAt(j)-'a']++;

            if(j-i+1 >s1.length())
            {
                s2count[s2.charAt(i)-'a']--;
                i++;
            }
            if(j-i+1 == s1.length())
            {
                if(Arrays.equals(s1count, s2count)){
                return true;
                }
            }
            j++;
        }
    return false;

    }
}