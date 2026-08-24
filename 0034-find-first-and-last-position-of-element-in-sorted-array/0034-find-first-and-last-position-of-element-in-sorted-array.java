class Solution {
    public int[] searchRange(int[] nums, int target) {
        int [] arr = new int [2];
        int l = 0;
        int r = nums.length-1;

        int s = binarySearch(nums,l,r,target,true);
        int e = binarySearch(nums,l,r,target,false);

        arr[0] = s;
        arr[1] = e;

        return arr;
    }

    public int binarySearch(int[] nums,int l,int r,int target,boolean s)
    {
        if(l>r)
        {
            return -1;
        }

        int mid = l+ (r-l)/2;

        if(nums[mid] == target)
        {
            if(s)
            {
                int temp = binarySearch(nums, l, mid-1, target,true);
                return (temp==-1) ? mid:temp;
            }
            else
            {
                int temp = binarySearch(nums, mid+1,r, target,false);
                return (temp==-1) ? mid:temp;
            }
        }

        else if(nums[mid] > target)
        {
           return binarySearch(nums,l,mid-1,target,s);
        }
        else 
        {
            return binarySearch(nums,mid+1,r,target,s);
        }
    }
}