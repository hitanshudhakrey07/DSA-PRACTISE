class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {

            ans[i] = -1; 

            // Circular traversal
            for (int j = i + 1; j < i + n; j++) {

                int index = j % n;

                if (nums[i] < nums[index]) {
                    ans[i] = nums[index];
                    break;
                }
            }
        }

        return ans;
    }
}