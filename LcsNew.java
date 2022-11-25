import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int n1=ob.nextInt();
		int n2=ob.nextInt();
		int max=(n1>n2)?n1:n2;
		while(true)
		{
			if(max%n1==0&&max%n2==0)
			{
				System.out.println("Lcs of two number is: "+max);
				break;
			}
			max++;
		}
		
	}
}