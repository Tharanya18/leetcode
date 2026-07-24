class Solution {
    public int countPoints(String rings) {
        HashMap<Integer , HashSet<Character>> map = new HashMap<>();
        for( int i = 0 ;i < rings.length() ; i+=2){
            char color = rings.charAt(i);
            int rod = rings.charAt(i+1) - '0';

            if(! map.containsKey(rod)){
                map.put(rod , new HashSet<>());
            }
            map.get(rod).add(color);
        }

        int count = 0 ;
        for( HashSet<Character> hs : map.values()){
            if(hs.size() == 3)
             count++;
        }
        return count;
    }
}