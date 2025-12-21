
// leetCode : 121 Best Time to Buy and Sell Stock
// Appraoch Greedy/one-pass
//Time complexity O(n)
//Space complexity O(n)
public class SellBuy {
 public static int maxProfit(int [] prices)
 {
    //Edge case 
    if(prices==null||prices.length==0)
    {
        return 0;
    }
int min=prices[0];
int maxProfit=0;
for(int i=0;i<prices.length;i++)
{
int cost=prices[i]-min;
maxProfit=Math.max(maxProfit,cost);
min=Math.min(min,prices[i]);
}
return maxProfit;
 }  
 public static void main(String[] args) {
    
 int prices[]={6,8,-1,0};
 int result=maxProfit(prices);
 System.out.println("maximum profit is"+" "+result);
 }
}
