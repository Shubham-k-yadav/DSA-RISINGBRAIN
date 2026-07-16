class Solution {
    public int trap(int[] height) {
        int larr[] = new int[height.length];
        int rarr[] = new int[height.length];

        larr[0] = height[0];
        for(int i=1;i<height.length ;i++)
        {
            larr[i] = Math.max(larr[i-1],height[i]);
        }

        rarr[height.length-1] = height[height.length-1];

        for(int i=height.length-2;i>= 0 ;i--)
        {
            rarr[i] = Math.max(rarr[i+1],height[i]);
        }

        int water = 0;

        for(int i=0;i<height.length;i++)
        {
            water += Math.min(larr[i],rarr[i])-height[i];
        }
        return water;
    }
}