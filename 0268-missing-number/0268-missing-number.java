class Solution {
    public int missingNumber(int[] nums) {
        int N = nums.length;
        int[] hash = new int[N+1];
        for( int num : nums)
        {
            hash[num]=1;
        }
        for( int i = 0 ; i<=N ; i++)
        {
            if(hash[i]==0)
            {
                return i;
            }
        }
     return -1;
    }
}