class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Deque<Integer> q = new ArrayDeque<>();
        Stack<Integer> st = new Stack<>();
        int count = 0;
        for( int student : students){
            q.offerLast(student);
        }
        for( int i = sandwiches.length-1 ; i>= 0 ; i--){
            st.push(sandwiches[i]);
        }
        while(!q.isEmpty() && !st.isEmpty()){
            int stu = q.peek();
            int san = st.peek();
            if(stu == san){
                q.pollFirst();
                st.pop();
                count = 0 ;
            }
            else{
                int insert = q.pollFirst();
                q.offerLast(insert);
                count++;
            }
            if( count == q.size()){
                return count;
            }
        }
        return count;
    }
}