//BubbleSort bro
import java.util.Scanner;
import java.util.Arrays;
public class BubbleSortCmd{
	public static void main(String[] args) {
		
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the size of the arrays");
		int size=ob.nextInt();
		System.out.println("Enter the array elements");
		int arr[]=new int[size];
		
		for(int i=0;i<size;i++)
		{
			arr[i]=ob.nextInt();
		}
		
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-i-1;j++)
			{
			 if(arr[j]>arr[j+1])
			 {
			 	int temp=arr[j];
			 	arr[j]=arr[j+1];
			 	arr[j+1]=temp;
			 }
			}
		}
		System.out.print(Arrays.toString(arr));
			 		
	}
}