class Solution {
    public int[] concatWithReverse(int[] nums) {
       
        int n = nums.length;
        int[] ans = new int[2 * n];
        
        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];          // Front half
            ans[n + i] = nums[n - 1 - i]; // Back half (reversed)
        }
        
        return ans;
    }
}
