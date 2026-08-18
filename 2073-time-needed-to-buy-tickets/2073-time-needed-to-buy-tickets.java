class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Deque<Integer> dq = new ArrayDeque<>();
        int time = 0 ;
        for( int i = 0 ; i < tickets.length ; i++){
            dq.offerLast(i);
        }
        while(!dq.isEmpty()){
            int person = dq.pollFirst();
            tickets[person]--;
            time++;

            if(person == k && tickets[person] == 0){
                return time;
            }
            if(tickets[person] > 0){
                dq.offerLast(person);
            }
        }
        return time;
    }
}