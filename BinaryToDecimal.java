import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		int rem,dec=0,num,base=1;
		System.out.println("Enter the binary number:");
		num=ob.nextInt();
		while(num!=0)
		{
			rem=num%10;
			dec=dec+(rem*base);
			num=num/10;
			base=base*2;
	}
	System.out.println("The decimal value is="+dec);
}
}