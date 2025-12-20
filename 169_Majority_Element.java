// Leetcode: 169 Majority Element
// by using Moore's Voting Algorithm
// Time Cpmplexity O(n)
//Space Complextiy O(1)

class Solution {
    public int majorityElement(int[] nums) {
        int count =0;
        int candidate=0;
        int n=nums.length;
        for(int i=0; i<n; i++)
        {
if(count==0)
{
candidate=nums[i];
}
if(candidate==nums[i])
{
count++;
}
else 
{
    count--;
}
        }
        return candidate;
    }
}