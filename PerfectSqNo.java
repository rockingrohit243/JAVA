import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter one numbers: ");
		int num=ob.nextInt();
		int sum=0;
		for(int i=1;i<=num/2;i++)
		{
		   if(num%i==0)
		    {
		    	sum=sum+i;
		    }
		}
		if(sum==num)
		 System.out.println("perfect square no");
	    else 
	     System.out.println("Not p. sq. no.");	
	    }
	    
	}
