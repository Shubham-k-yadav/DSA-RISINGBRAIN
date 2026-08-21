class Solution {
    public int maxScore(int[] c, int k) {
        int n = c.length;
        k = n-k;

        int ts = 0;

        for(int i=0;i<n;i++)
        {
            ts += c[i];
        }

        int i=0;
        int j=0;
        int s = 0;

        while(j<k)
        {
            s+=c[j];
            j++;
        }
        int min = s;

        while(j<n)
        {
            s -= c[i];
            i++;
            s += c[j];
            j++;

            min = Math.min(min,s);
        }

        return ts-min;
    }
}