public class LongestSubarrayBruteForce {
    public static int BruteForceApproach(int []arr,int k)
    {
        int maxlen=0;
        int n=arr.length;
for(int i=0;i<n;i++)//start index
{
for(int j=i;j<n;j++)//end index
{
int sum=0;
for(int p=i;p<=j;p++)//sum of subarray
{
    sum+=arr[p];

}

if(sum==k)
{
maxlen=Math.max(maxlen, j-i+1);
}
}
}
return maxlen;
}

    public static void main(String[] args) {
        int arr[]={0,0,1,2,1,1,1,1,0,2,1,2,4,1,0,};
        int k=6;
        int result=BruteForceApproach(arr,k);
        System.out.println(result);
    }
}
