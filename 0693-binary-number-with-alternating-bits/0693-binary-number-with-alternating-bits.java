class Solution {
    public boolean hasAlternatingBits(int n) {
        int curr = n%2;
        n = n/2;

        return count( n,curr);
    }

    public boolean count( int n,int curr)
    {
        if(n==0)
        {
            return true;
        }
        else if(n%2 == curr)
        {
            return false;
        }

        curr = n%2;
        n = n/2;

        return count(n,curr);
        
    }
}