class Solution {
    public int dominantIndex(int[] nums) {
        int n = nums.length;
        int max = 0;
        int index = -1;
        boolean istrue = true;
        for( int i = 0 ; i < n ; i++){
          max = Math.max(max , nums[i]);
        }
        for( int i = 0 ; i < n ; i++){
            if(nums[i] == max){
                    index = i;
                    continue;
            }
            int sum = nums[i]* 2;
            if( sum > max){
                istrue =false;
                break;
            }
        }
        if(istrue)
          return index;
        return -1;
    }
}