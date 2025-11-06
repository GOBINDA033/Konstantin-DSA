//This problem solved by using sliding window approach
class longestSubarrayOptimalAppraoch{
    public static int Optimal(int arr[],int k)
    {
        int sum=0;
int maxlen=0,left=0;
for(int right=0;right<arr.length;right++)
{
sum += arr[right]; //addition of rigth elements
while(sum>k &&left<=right)
{
sum -= arr[left];
left++;
}
if(sum==k)
{
maxlen=Math.max(maxlen,right-left + 1);
}
 }
    return maxlen;
    }
    
    public static void main(String args[])
    {
int arr[]={1,2,3,1,1,1};
int k=6;
int result=Optimal(arr,k);
System.out.println(result);
 }
}

//The time complexity of this code is O(n)
//The spcae complexity of this code is O(1)