class Solution {
    public int majorityElement(int[] nums) {
        int maxi = -1;
        HashMap<Integer , Integer> hm = new HashMap<>();
        for( int i = 0 ; i < nums.length ; i++){
            int n = nums[i];
            hm.put(n , hm.getOrDefault(n , 0)+1);
        }
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()){
            maxi = Math.max(maxi , entry.getValue());  
        }
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            if (entry.getValue() == maxi) {
                return entry.getKey();
            }
        }
        return -1;
    }
}