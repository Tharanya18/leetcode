class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> result = new ArrayList<>();
        HashSet<Integer> set1  = new HashSet<>();
        HashSet<Integer> set2  = new HashSet<>();
        for(int i = 0 ; i < nums1.length ; i++)
        {
            set1.add(nums1[i]);
        }
        for(int i = 0 ; i < nums2.length ; i++)
        {
            set2.add(nums2[i]);
        }
        List<Integer> first = new ArrayList<>();
        List<Integer> second = new ArrayList<>();

        for( int n : set1)
        {
            if(! set2.contains(n ))
              first.add(n);
        }
         for( int n : set2)
        {
            if(! set1.contains(n ))
              second.add(n);
        }
        result. add(first);
        result.add(second);
        
return result;
    }
}