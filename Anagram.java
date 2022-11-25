import java.util.Scanner;
import java.util.Arrays;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first string");
		String str1=sc.nextLine();
		System.out.println("Enter the second string");
		String str2=sc.nextLine();
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		char arr1[]=str1.toCharArray();
		char arr2[]=str2.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		if(Arrays.equals(arr1,arr2)==true)
		{
			System.out.println("Both string are  Anagram");
		}
		else
		  {
		  	System.out.println("Both the string are not equal");
		  }
	}

		  	
		
		
}