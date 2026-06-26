class Solution {
    public int minimumOperations(int[] nums) {
        int count = 0 ;
        for ( int i = 0 ; i < nums.length ; i++){
            int n = nums[i];
            int subtract = n-1 ;
            int add = n+1; 
            if((subtract % 3 == 0) || (add % 3 == 0)){
                count++;
            }

        }
        return count;
    }
}