class Solution {
    public int maxDistance(int[] p, int m) {
        Arrays.sort(p);
        int l = 1;
        int h = p[p.length-1]-p[0];
        int ans = 0;

        return binarySerach(l,h,p,m,ans);
    }

    public int binarySerach(int l,int h,int[] p,int m,int ans)
    {
        if(l>h)
        {
            return ans;
            
        }

        int mid = l+(h-l)/2;

        if(canPlace(p,m,mid))
        {
            ans = mid;
            l = mid+1;
            return binarySerach(l,h, p, m, ans);
        }
        else
        {
            h = mid-1;
            return binarySerach( l, h, p, m, ans);
        }
    }

    private boolean canPlace(int[] p,int m,int mid)
    {

        int count = 1;
        int l = p[0];

        for(int i=1;i<p.length;i++)
        {
            if(p[i]-l >= mid)
            {
                count++;
                l = p[i];
            }
        }

        if(count>=m)
        {
            return true;
        }
        return false;
    }
}