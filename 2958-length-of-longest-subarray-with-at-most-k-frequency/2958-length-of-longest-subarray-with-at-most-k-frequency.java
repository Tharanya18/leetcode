class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int left  = 0 ; 
        int maxlen = 0;
        HashMap<Integer , Integer> map = new HashMap<>();
        for( int right = 0 ; right <nums.length ; right++){
            int n = nums[right];
            map.put(n , map.getOrDefault(n,0)+1);
            while(map.get(n) >k){
                int l = nums[left];
                map.put(l , map.get(l)-1); 
                left++;
            }
            maxlen = Math.max(maxlen , right - left + 1);
        }
        return maxlen;
    }
}