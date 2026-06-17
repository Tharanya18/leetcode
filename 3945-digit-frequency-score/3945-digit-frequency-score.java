class Solution {
    public int digitFrequencyScore(int n) {
        HashMap <Integer , Integer > hm = new HashMap<>();
        int sum = 0 ;
        while( n != 0)
        {
            int s = n% 10;
            hm.put(s , hm.getOrDefault(s , 0) +1);
            n = n/10;
        }
        for( Map.Entry<Integer, Integer> entry : hm.entrySet())
        {
            
           sum = sum+ (entry.getKey() * entry.getValue());
        }

        return sum;
    }
}