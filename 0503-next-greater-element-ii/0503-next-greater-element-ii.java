class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        Stack<Integer> st = new Stack<>();
        Arrays.fill(result,-1);


        for(int i = 2*n-1;i>=0;i--){
            int currIdx = i%n;
            int currValue = nums[currIdx];
            while(!st.isEmpty() && st.peek()<=currValue){
                st.pop();
            }
            if(!st.isEmpty() && i<n){
                result[currIdx] = st.peek();
            }
            st.push(currValue);
        }
        return result;
    }
}
