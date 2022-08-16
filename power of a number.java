import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
	System.out.println("Enter base and exponent:");
	int value=1;
			int base=ob.nextInt();
		int exponent=ob.nextInt();
		while(exponent!=0)
		{
			 value=value*base;
			exponent--;
		
	}
	System.out.println("The result is:");
	System.out.println(value);
	}
}