class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double max =  Integer.MIN_VALUE; 
        for( int i = 0; i <= nums.length - k ; i++)
        {
            int sum = 0;
            for( int j = i ; j < i+k ; j++ )
            {
                sum += nums[j];
            }
            double res = (double)sum/k;
            max= Math.max( max , res);
        }

        return max;
    }
}