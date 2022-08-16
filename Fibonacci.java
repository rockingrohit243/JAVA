import java.util.Scanner;
public class FibonacciSeries
{
	public static void main(String args[])
	{ Scanner ob=new Scanner(System.in);
		int fib1=0,fib2=1,fibsum,range;
		System.out.println("Enter the term of fibonacci series that you want");
		range=ob.nextInt();
		System.out.println("Fibonacci series:");
		System.out.print(fib1+" "+fib2);
		for(int i=2;i<range;i++)
		 {
		 	fibsum=fib1+fib2;
		 	System.out.print(" "+fibsum);
		 	fib1=fib2;
		 	fib2=fibsum;
		 }
	}
}
		
		
		