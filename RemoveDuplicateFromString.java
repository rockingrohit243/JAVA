import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String str=sc.nextLine();
		str=str.toLowerCase();
		str=str.replace(" ","");
		char arr[]=str.toCharArray();
		System.out.println("Entered array is:");
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
				 arr[j]=' ';
				}
			}
		}
		System.out.println("After removing the duplicate element from the string:");
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=' ')
			{
				System.out.print(arr[i]);
			}
		}
		
	}
}