class Solution {
    public String makeFancyString(String s) {
       StringBuilder str= new StringBuilder();
       int count=0;
       char c= s.charAt(0);
       for(int i=0;i<s.length();i++)
       {
        if(count<2&& c==s.charAt(i))
        {
        str.append(s.charAt(i));
        count++;
        }
        if(c!=s.charAt(i))
        {
            str.append(s.charAt(i));
            count=1;
            c=s.charAt(i);
        }
       }
       return str.toString();
    }
}