class Solution {
    public int countSubstrings(String s) {
        int ans = 0;
        for(int i=0;i<s.length();i++)
        {
            String str = "";

            for(int j=i;j<s.length();j++)
            {
                str += s.charAt(j);
                if(palindrome(str))
                {
                    ans++;
                }

            }
        }
        return ans;
    }

    public boolean palindrome(String str)
    {
        int l = 0;
        int r = str.length()-1;

        while(l<r)
        {
            if(str.charAt(l) != str.charAt(r))
            {
                return false;
            }
            l++;
            r--;

        }
        return true;
    }
}