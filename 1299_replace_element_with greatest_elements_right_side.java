class Solution {

    /*
     * Problem: LeetCode 1299 - Replace Elements with Greatest Element on Right Side
     *
     * Approach:
     * 1. Traverse the array from right to left.
     * 2. Maintain a variable 'maxi' to store the maximum element seen so far on the right.
     * 3. Replace the current element with 'maxi'.
     * 4. Update 'maxi' with the maximum of current element and previous 'maxi'.
     *
     * Time Complexity:
     * O(n) -> We traverse the array exactly once.
     *
     * Space Complexity:
     * O(1) -> No extra space is used (in-place modification).
     */

    public int[] replaceElements(int[] arr) {

        // Length of the array
        int n = arr.length;

        // Stores the greatest element on the right side
        // Initialized with -1 because the last element has no right side
        int maxi = -1;

        // Traverse from right to left
        for (int i = n - 1; i >= 0; i--) {

            // Store current element temporarily
            int current = arr[i];

            // Replace current index with right side maximum
            arr[i] = maxi;

            // Update the right side maximum
            maxi = Math.max(maxi, current);
        }

        // Return the modified array
        return arr;
    }
}
