import java.util.Scanner;
import java.util.Arrays;
public class Main {
	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
	
	System.out.println("Enter the size");
	int size=ob.nextInt();
	int arr[]=new int[size];
	System.out.println("Enter arr ele");
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=ob.nextInt();
	}
	Arrays.sort(arr);
	//	System.out.println("Enter the element");
	int no=10;
int start=0;
int last=arr.length-1;
int mid=(start+last)/2;
while(start<=last)
{
	if(arr[mid]==no)
	{System.out.println("element found");
	break;
	}
	else
{
	 if(arr[mid]<no)
	   start=mid+1;
	  else
	   last=mid-1;
}}
if(start>last)
 System.out.println("Elent not found");

	
	
	
	    }
	    
	}
