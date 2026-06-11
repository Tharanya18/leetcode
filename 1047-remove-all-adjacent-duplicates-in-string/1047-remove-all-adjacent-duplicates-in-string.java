class Solution {
    public String removeDuplicates(String s) {
        int i = 0 ; 
        Stack<Character> st =  new Stack<>();
        StringBuilder sb = new StringBuilder();
        while( i < s.length())
        {
            char ch = s.charAt(i);
            if(st.isEmpty() || st.peek()!= ch)
            {
                st.push(ch);
            }
            else{
                st.pop();
            }
            i++;
        }
        while( ! st.isEmpty())
        {
            sb.append(st.peek());
            st.pop();
        }
        return sb.reverse().toString();
        
    }
}