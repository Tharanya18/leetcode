class Solution {
    public String majorityFrequencyGroup(String s) {
        /*int[] freq =  new int[26];
        for (int i= 0 ; i < s.length() ; i++)
        {
            char ch = s.charAt(i);
            freq[ch - 'a']++;
        }*/
        Map < Character , Integer > map = new HashMap<>();
        for( int i = 0 ;i < s.length() ; i++)
        {
            char ch = s.charAt(i);
            if(map.containsKey(ch))
            {
                map.put(ch , map.get(ch)+1);
            }
            else{
                map.put(ch ,1);
            }
        }
        Map < Integer , Integer > mpp = new HashMap<>();
        for( int frequency : map.values())
        {
           
            if(mpp.containsKey(frequency))
            {
                mpp.put(frequency , mpp.get(frequency)+1);
            }
            else{
                mpp.put(frequency ,1);
            }
        }
        int max = 0 ; 
        int majorityfreq= 0 ;
        for( Map.Entry<Integer , Integer> entry : mpp .entrySet())
        {
            int frequency = entry.getKey();
            int count =  entry.getValue();

            if(count > max || (max == count && frequency > majorityfreq)){
               max = count;
               majorityfreq = frequency;
            }
        }

        StringBuilder ans =  new StringBuilder();
        for( int i = 0; i <s.length() ; i++)
        {
            char ch = s.charAt(i);
            if(map.get(ch) == majorityfreq && ans.indexOf(String.valueOf(ch))== -1)
            {
                    ans.append(ch);
            }
        }
    return ans.toString();
    }
}