public class Reverse{
    public static void main(String[] args) {
        int num[]={7,2,5,1,8,0,12};
        int temp = 0;
        int j=6;

        for(int i=6;i<num.length-1;i--)
        {
          // System.out.println(num[i]); 
if(j<7)
{
num[i]=temp;
temp=num[i+1];
num[i+1]=temp;
 
}
 System.out.print(num[i]);
        }
      
    }
}