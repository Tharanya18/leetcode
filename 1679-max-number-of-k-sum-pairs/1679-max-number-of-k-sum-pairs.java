class Solution {
    public int maxOperations(int[] nums, int k) {
        HashMap<Integer , Integer > hm = new HashMap<>();
        int count = 0;
        for( int i = 0 ; i  < nums.length ; i++)
        {
            int pick = nums[i];
            int need =  k - pick;
            if( hm.containsKey(need) && hm.get(need) >0)
            {
                count++;
                hm.put(need , hm.get(need) -1);
                if(hm.get(need)==0)
                  hm.remove(need);
            }
            else{
                hm.put( pick , hm.getOrDefault(pick , 0)+1);
            }
        }
        return count;
    }
}