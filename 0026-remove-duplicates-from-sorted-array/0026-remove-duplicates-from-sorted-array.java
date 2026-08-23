class Solution {
    public int removeDuplicates(int[] nums) {
        
        Stack<Integer> st = new Stack<>();

        for(int i = 0; i < nums.length; i++) {
            if(st.isEmpty()) {
                st.push(nums[i]);
            }
            else if(nums[i] == st.peek()) {
                // duplicate hai, ignore karo
            }
            else {
                st.push(nums[i]);
            }
        }

        // Stack ke unique elements ko nums mein copy karo
        int k = 0;
        for(int value : st) {
            nums[k] = value;
            k++;
        }

        return st.size();
    }
}