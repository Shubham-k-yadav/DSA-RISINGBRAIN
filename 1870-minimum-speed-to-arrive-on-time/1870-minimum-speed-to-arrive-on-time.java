class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
        int low = 1;
        int high = 10_000_000;
        int ans = -1;

        if (hour <= dist.length - 1)
        {
            return -1;
        }

        while(low<=high)
        {
            int mid = low+(high-low)/2;

            if (canReach(dist, hour, mid))
            {
                ans = mid;
                high = mid - 1;
            }
            else
            {
                low = mid+1;
            }
        }
        return ans;
    }

    public boolean canReach(int[] dist,double hour,int speed)
    {
        double time = 0;

        for (int i = 0; i < dist.length - 1; i++)
        {
            time += Math.ceil((double) dist[i] / speed);

            if (time > hour)
            {
                return false;
            }
        }

        time += (double) dist[dist.length - 1] / speed;

        return time <= hour;
    }
}