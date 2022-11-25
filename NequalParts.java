import java.util.Scanner;
import java.util.Arrays;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first string");
		String str1=sc.nextLine();
		 str1=str1.replace(" ","");
		System.out.println("How many times you want to divide?");
		int length=str1.length();
		
		int n=sc.nextInt();
		int partsize=length/n;
		if(str1.length()%n!=0)
		 System.out.println("String can be divided into equal parts");
		
		else
		 {
		 	char arr1[]=str1.toCharArray();
		 	System.out.println("The elemenets are");
		 	for(int i=0;i<arr1.length;i++)
		 	 {
		 	 	System.out.print(arr1[i]);
		 	 	if((i+1)%partsize==0)
		 	 	  {
		 	 	  System.out.println();
		 	 	  		
		 	 	  }
		 	 	
		 	 	  
		 	 	  
		 	 }
	}}}