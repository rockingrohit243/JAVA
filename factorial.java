import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the range");
		int range=ob.nextInt();
		int num1=0;
	//	System.out.println("Enter the second number");
		int num2=1;
		System.out.println("Fibo series are: ");
		System.out.println(num1+"\n"+num2);
		for(int i=2;i<range;i++)
		{
			int n3=num1+num2;
			System.out.println(n3);
			num1=num2;
			num2=n3;
		}
		
		
			
		
	}
}