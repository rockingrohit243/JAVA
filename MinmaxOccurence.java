import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String:");
		String str=sc.nextLine();
		str=str.toLowerCase();
		str=str.replace(" ","");
		char arr[]=str.toCharArray();
		char minchar=str.charAt(0);
		char maxchar=str.charAt(0);
		int frequency[]=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			frequency[i]=1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				 frequency[i]++;
			}
		}
		int min,max;
		 min=max=frequency[0];
		for(int i=0;i<frequency.length;i++)
		{
			if(min>frequency[i])
		{	min=frequency[i];
		minchar=arr[i];
		}
		if(max<frequency[i])
		{
			max=frequency[i];
			maxchar=arr[i];
		}
		}
		System.out.println("The minimum occurenece character is: "+minchar+" with"+min+" no. of times.");
		System.out.println("The maximum character is: "+maxchar+" with "+max +" times");
		
		
			 
	
		
		
	}
}