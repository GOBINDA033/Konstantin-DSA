//Find that how many 1 are present in array .
public class More {
    public static int MO(int [] nums)
    {
int coutn=0;

for(int i=0;i<nums.length;i++)
{
if(nums[i]==nums[0])
{
coutn++;
}

}
return coutn;
    }
    public static void main(String[] args) {
        int nums[]={1,2,3,1,2,1,1,7,10,17,26,3,1,23,45,1};
        
        int more=MO(nums);
     
        System.out.println("There has "+ more+ " occurance of 1");
    }
}
