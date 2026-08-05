class Solution {
    public String longestPalindrome(String str) {
        if(str.length() == 0 && str== null)
        {
            return "";
        }

        int s = 0;
        int e = 0;

        for(int i =0;i<str.length();i++)
        {
            int odd = palindrome(str,i,i);
            int even = palindrome(str,i,i+1);

            int max = Math.max(odd,even);

            if(max > e-s)
            {
                s = i- ( max - 1 )/ 2;
                e = i+max/2;
            }
        }

        return str.substring(s,e+1);
    }
    private int palindrome(String s, int left , int right)
    {
        while(left>=0 && right <s.length() && s.charAt(left)== s.charAt(right))
        {
            left--;
            right++;
        }
        return right - left -1;
    }
}