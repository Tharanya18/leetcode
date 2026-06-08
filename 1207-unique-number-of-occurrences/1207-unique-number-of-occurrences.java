class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer , Integer> result = new HashMap<>();
        for( int num : arr)
        {
            result.put(num , result.getOrDefault(num , 0)+1); 
        }
        HashSet<Integer> set = new HashSet<>();
        boolean containsDuplicate =  false;
        for( int n : result.values())
        {
           if( ! set.add(n))
            return false;
        }
        return true;
    }
}