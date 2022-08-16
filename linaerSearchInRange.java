public class Main 
{
	public static void main(String[] args) 
	{
		int arr[]={10,70,13,-34,48,90,63,77,88,11,22};
		int target=70;
	int start=0;
		int end=2;
		System.out.println(linearSearch(arr,target,start ,end));
	
	}
static int linearSearch(int arr[],int target,int start,int end)
{   
 for(int i=start;i<=end;i++)
   { int element=arr[i];
   	if(target==element)
         {
         	return element;
         }
   }
   return -1;
}
}