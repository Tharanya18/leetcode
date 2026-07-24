class Solution {
    public int mostFrequentEven(int[] nums) {
        int max =0;
        int num = -1;
        HashMap<Integer , Integer > map = new HashMap<>();
        for( int i= 0 ; i < nums.length ; i++){
            if( nums[i] % 2==0){
            map.put( nums[i] , map.getOrDefault(nums[i] , 0) +1);
            }
        }
       for(Map.Entry<Integer , Integer> entry :map.entrySet()){
        if( entry.getValue() > max){
            max = entry.getValue();
            num = entry.getKey();
        }
        else if( entry.getValue() == max && entry.getKey() < num)
          num = entry.getKey();
       }
       return num ;
    }
}