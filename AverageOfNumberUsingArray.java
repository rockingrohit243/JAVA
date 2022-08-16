import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		
		System.out.println("How many elememt you want to store?");
		int size=ob.nextInt();
		int arr[]=new int[size];
	  System.out.print("Enter the "+size+" element: ");
	  for(int i=0;i<size;i++)
	
	   {
	   	arr[i]=ob.nextInt();
		}
		System.out.print("you have entered:");
	  for(int i=0;i<size;i++)
	
	   {
	   	System.out.print("  "+arr[i]);
	   }
	   int sum=0;
	    for(int i=0;i<size;i++)
	
	   {
	    sum=sum+arr[i];
	   }
	   System.out.println();
	   double average=(double)sum/size;
	   System.out.println("The average of  "+size+" number is: "+average);
}	
}