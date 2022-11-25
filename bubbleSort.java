import java.util.Scanner;
import java.util.Arrays;
public class Main {
	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the size of tge arrays:");
		int size=ob.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the array element:");
		for(int i=0;i<size;i++)
		{
			arr[i]=ob.nextInt();
		}
		//Bubble sort Logic
		for(int i=0;i<size-1;i++)
		{
			for(int j=0;j<size-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
		
	}
}