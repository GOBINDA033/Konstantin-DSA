// leetcode 136: Single Number
// Using Bit Manipulation (XOR)
// Time Complexity: o(n)
// Space Complexity: O(1)

class Solution {
    public int singleNumber(int[] nums) {
        int ans =0;
        for( int i=0; i<nums.length; i++)
        {
ans=ans^nums[i];
        }
        return ans;
    }
}