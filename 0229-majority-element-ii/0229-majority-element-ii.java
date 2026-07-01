class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer , Integer > hm = new HashMap<>();
        List<Integer> al = new ArrayList<>();
        for( int i = 0 ; i < nums.length ; i++){
            int n = nums[i];
            hm.put(n , hm.getOrDefault(n , 0 )+1);
        }
        int size = nums.length /3;
        for(Map.Entry<Integer , Integer> entry : hm.entrySet()){
         if( entry.getValue() >size){
           al.add(entry.getKey());
         }
         
        }
        return al;
    }
}