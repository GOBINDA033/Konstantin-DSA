// LeetCode 1920
// Problem: Build Array from Permutation
// Difficulty: Easy
// Language: Java
// Time Complexity: O(n)
// Space Complexity: O(n)

class  solution {
    public int[] buildArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
