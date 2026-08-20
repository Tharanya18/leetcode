class Solution {
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        int[] arr =  new int[n];
        Stack<Integer> st = new Stack<>();
        for( int i = n-1 ; i >= 0 ; i--){
            while( !st.isEmpty() && st.peek() > prices[i]){
                st.pop();
            }
            if(!st.isEmpty()){
                arr[i] = prices[i] - st.peek();
            }
            else{
                arr[i] = prices[i];
            }
            st.push(prices[i]);
        }
        return arr;
    }
}