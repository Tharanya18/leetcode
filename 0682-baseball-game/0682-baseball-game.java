class Solution {
    public int calPoints(String[] operations) {
        int sum = 0 ;
        Stack<Integer> st =  new Stack<>();
        for(String op :operations){
            if(op.equals("C")){
                st.pop();
            }
            else if(op.equals("D")){
                int last = st.peek();
                st.push(last * 2);
            }
            else if( op.equals("+")){
                int l = st.pop();
                int second = st.peek();
                int add = l + second;
                st.push(l);
                st.push(add);
            }
            else{
                st.push(Integer.parseInt(op));
            }
        }
        for( int n : st){
          sum += n ;
        }
        return sum;
    }
}