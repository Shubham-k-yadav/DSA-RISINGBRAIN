class Solution {
    public int mySqrt(int x) {
        if(x<2) return x;

        int l = 1;
        int r = x/2;

        while(l<=r)
        {
            int m = l+(r-l)/2;

            long s = (long) m*m;

            if(x == s)
            {
                return m;
            }

            else if(s<x)
            {
                l = m+1;
            }
            else
            {
                r = m-1;
            }
        }
        return r;
    }
}