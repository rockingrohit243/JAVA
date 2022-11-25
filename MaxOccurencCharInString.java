import java.util.Scanner;
import java.util.*;
import java.util.Arrays;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		str=str.replace(" ","");
		str=str.toLowerCase();
		char arr[]=str.toCharArray();
		System.out.println("Number of occurenece of each chracter are:");
		Map <Character,Integer> map=new TreeMap<>();
		for(int i=0;i<arr.length;i++)
		{int count=0;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
			}
			map.put(arr[i],count);
			
		}
		System.out.println(map);
		
	}
}