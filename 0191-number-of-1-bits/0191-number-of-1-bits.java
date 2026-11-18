class Solution {
    int count = 0;
    public int hammingWeight(int n) {
        return countOnes(n);
    }

    public int countOnes( int n)
    {
        if(n == 0)
        {
            return count;
        }

        count += n%2;
        n = n/2; 
        return countOnes(n);
    }
}