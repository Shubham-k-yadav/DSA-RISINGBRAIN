class Solution {
    public int minEatingSpeed(int[] p, int h) {
        int l = 1;
        int r = 0;
        for(int i=0;i<p.length;i++)
        {
            r = Math.max(r,p[i]);
        }

        return binarySearch(p,l,r,h,r);

    }

    public int binarySearch(int[]p,int l,int r,int h,int ans)
    {

        if(l>r)
        {
            return ans;
        }

        int m = (l+r)/2;

        int sum = 0;

        for(int i = 0;i<p.length;i++)
        {
            sum += Math.ceil((double)p[i] / m);
        }

        if(sum<=h)
        {
            ans= m;
            return binarySearch(p,l,m-1,h,ans);
        }
        else 
        {
            return binarySearch(p,m+1,r,h,ans);
        }
        
    }
}