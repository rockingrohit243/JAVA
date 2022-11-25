import java.util.Scanner;
public class Main {
	public static int Gcd(int a,int b)
	{int gcd=0;
		for(int i=1;i<=a&&i<=b;i++)
		{
			if(a%i==0&&b%i==0)
			{
			gcd=i;
			}
		}
		System.out.println("The gcd of two number is:"+gcd);
		return 0;
	}
	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the first number:");
		int a=ob.nextInt();
		System.out.println("Enter the second number");
		int b=ob.nextInt();
		Gcd(a,b);
	//	System.out.println(gcd);
		
	}
}