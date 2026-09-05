class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if((long)m * k > bloomDay.length)
        {
            return -1;
        }

        int l = bloomDay[0];
        int h = bloomDay[0];

        for(int i=1;i<bloomDay.length;i++)
        {
            l = Math.min(l,bloomDay[i]);
            h = Math.max(h,bloomDay[i]);
        }

        return binarySearch(l,h,bloomDay,m,k);
    }

    public int binarySearch(int l,int h,int[] bloomDay,int m,int k)
    {
        while(l<=h)
        {
            int mid = l+(h-l)/2;

            int count = 0;
            int b = 0;

            for(int i=0;i<bloomDay.length;i++)
            {
                if(bloomDay[i]<=mid)
                {
                    count++;

                    if(count == k)
                    {
                        b++;
                        count = 0;
                    }
                }

                else
                {
                    count = 0;
                }
            }

            if(b >= m)
            {
                h = mid-1;
            }
            else
            {
                l = mid+1;
            }
        }
        return l;
    }
}