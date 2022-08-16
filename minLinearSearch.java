public class Main 
{
	public static void main(String[] args) 
	{
		int arr[]={900,-796,70,13,-34,48,90,63,77,88,11,22};
		System.out.println(minLinearSearch(arr));
	
	}
static int minLinearSearch(int arr[])
{  int min= arr[0];
 for(int i=1;i<arr.length;i++)
   { 
   	if(min>arr[i])
         {
         	min=arr[i];
         }
         
   }
   return min;
}
}