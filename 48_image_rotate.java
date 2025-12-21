//leetcode: 48 Rotate Image 
// Time complexity O(n^2)
// space complexity O(1)

class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for(int i =0; i<n-1; i++)
        {
        for(int j=i+1; j<n; j++)
        {
int temp =matrix[i][j];
matrix[i][j] = matrix[j][i];
matrix[j][i] = temp;

}
   }
        
        for(int i=0; i<n; i++)
        {
reverseRow(matrix[i]);
         }
     
}
static void reverseRow(int[]row)
{
int left=0; int right = row.length-1;
while(left<right)
{
    int temp=row[left];
    row[left] = row[right];
    row[ right] =temp;
    left++;
    right--;
}
}
}

  
