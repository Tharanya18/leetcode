class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer , Integer > map =  new HashMap();
        for( int i = 0 ; i < nums.length ; i++)
        {
            int n = nums[i];
            if( map.containsKey(n))
            {
                map.put( n , map.get(n)+1);
            }
            else{
                map.put(n , 1);
            }
        }
        for(Map.Entry<Integer , Integer > entry : map.entrySet())
        {
            if( entry.getValue() == 1)
                  return entry.getKey();
        }
       return -1;
    }
}