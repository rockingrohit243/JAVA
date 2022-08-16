import java.util.Arrays;
public class Main 
{
	public static void main(String[] args) 
	{
		int arr[][]={
			{900,-796,70},
			{13,-34,48},
			{90,63,77},
			{88,11,22}
		};
		int target=-796;
	int another_array[]=minLinearSearch(arr, target);
	System.out.println(Arrays.toString(another_array));
	
	}
static int[] minLinearSearch(int arr[][],int target)
{  
 for(int row=0;row<arr.length;row++)
   { 
      for(int col=0;col<arr[row].length;col++)
      {
   	if(arr[row][col]==target)
         {
         	return new int[] {row,col};
         }
         
     }
   }
   return new int[] {-1,-1};
   
}
}