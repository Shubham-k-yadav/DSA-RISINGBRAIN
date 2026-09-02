class Solution {
    public int shipWithinDays(int[] w, int days) {
        int max = 0;
        int min = 0;

        for (int i = 0; i < w.length; i++) {
            max += w[i];
            min = Math.max(min, w[i]);
        }
        return binarySearch(w, days, min, max);
    }

    public int binarySearch(int[] w, int days, int l, int r) {

         if (l == r) {
            return l;
        }
        int mid = l + (r - l) / 2;
        int currw = 0;
        int d = 1;
        

        for (int i = 0; i < w.length; i++) {
            if (currw + w[i] <= mid) {
                currw += w[i];
            } else {
                d++;
                currw = w[i];
            }
        }

        if (d <= days) {
            return binarySearch(w, days, l, mid);
        } else {
            return binarySearch(w, days, mid+1, r);
        }
    }
}