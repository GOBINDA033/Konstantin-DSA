// leetcode : 283 Move Zeroes
// using Two pointer approach
//Time Complexity O(n)
//Space Complexity O(1)

class Solution {
    public void moveZeroes(int[] nums) {
       int lastNonZero=0; 
       for(int i =0; i < nums.length; i++)
       {
if ( nums[i]!=0 )
{
nums[ lastNonZero ]=nums[i];
lastNonZero++;
}
       }
for( int i=lastNonZero; i < nums.length; i++)
{
nums[i]=0;
}
       
    }
}
