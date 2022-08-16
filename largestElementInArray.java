import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	
		int i,size;
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the size");
		size=ob.nextInt();
			int arr[]=new int[size];
		System.out.println("Enter the array elements");
			for( i=0;i<size;i++)
			 {
			 	arr[i]=ob.nextInt();
			 }
	     int largest=arr[0];
		for( i=0;i<arr.length;i++)
		{
			if(largest<arr[i])
			largest=arr[i];
	
    	}
	System.out.println("The largest number is="+largest);
	
	}
}