class Solution {
    public int minimumDifference(int[] nums, int k) {
        int minimum = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for( int i = 0 ; i <= nums.length - k ; i++)
        {
            int diff = nums[i+k-1]-nums[i];
            minimum = Math.min( minimum , diff);
        }

        return minimum;
    }
}