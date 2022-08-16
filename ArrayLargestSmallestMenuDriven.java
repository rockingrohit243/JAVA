import java.util.Scanner;
public class Rohit  
   {
	public static void main(String[] args) {
	
		int i,size;
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the size of the array in number: ");
		size=ob.nextInt();
			int arr[]=new int[size];
		System.out.println("Enter the array elements: ");
			for( i=0;i<size;i++)
			 {
			 	arr[i]=ob.nextInt();
			 }
	     
		for( i=0;i<arr.length;i++)
		{ for(int j=i+1;j<arr.length;j++)
		 {
			if(arr[i]>arr[j])
			  {
			  	int temp=arr[j];
			  	arr[j]=arr[i];
			  	arr[i]=temp;
	     	 }
		 }
  	}
  	
  	
/*	for( i=0;i<size;i++)
			 {//sorting
			 arr[i]=arr[i];
			 }*/
			 while(true)
			 {
			 	System.out.println("you want to see smallest , largest or not interested ?" + "\n(Press 0 for smallest ,1 for largest and any(not 0 or 1) for not intereated) ");
			 	int userchoice=ob.nextInt();
			 	if(userchoice==1)
			 	{
			 System.out.println("Enter nth largest number that you want to see ");
  	int nth=ob.nextInt();
	System.out.println("The "+nth+"th largest elememt is: "+arr[nth-1]);
			 	}
			 	else
			 	if(userchoice==0)
			 	{System.out.println("Enter nth smallest number that you want to see");
  	int sth=ob.nextInt();
	System.out.println("The "+sth+ "th smallest elememt is: "+arr[sth-1]);
			 	  	
			 }
			 else
		{	 
			 System.out.println("Thank you ");
			 break;
    	}
	}}}