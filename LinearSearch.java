import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		//creating object for scanner class
		Scanner ob=new Scanner(System.in);
		//initializing array element
		int arr[]={10,30,19,47,65,89,100,7890,12};
		//getting input from user
		System.out.println("enter the target");
		int target=ob.nextInt();
	//	/calling function
		boolean result=LinearSearch(arr,target);
		//displaying result
		System.out.println(result);
	}
	static boolean LinearSearch(int arr[],int target)
	{
		if(arr.length==0)
	 	  return false;
		for(int index=0;index<arr.length;index++)
		  {
		  	if(arr[index]==target)
		  	  return true;
		   }
		   return false;
   }         
		  	  
}