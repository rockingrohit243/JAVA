import java.util.Arrays;
import java.util.Scanner;
public class BubbleFun{
static int[] BubbleSort(int arr[])
	{for(int i=0;i<arr.length-1;i++)
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
	
	return arr;
		}
		
		
	
	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the size of the Array:");
		int size=ob.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the array element:");
		for(int i=0;i<size;i++)
		{
			arr[i]=ob.nextInt();
		}
		BubbleSort(arr);
		System.out.println("Elements of array are"+Arrays.toString(arr));
	
		}
		}
		