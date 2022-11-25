import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int num1=ob.nextInt();
		int num2=ob.nextInt();
	    int gcd=1;
	    for(int i=1;i<=num1&&i<=num2;i++)
	    {
	    	if((num1%i==0)&&(num2%i==0))
	    	{
	    		gcd=i;
	    	}
	    }
	    System.out.println("gcd"+gcd);
	    	
	    }
	    
	}
