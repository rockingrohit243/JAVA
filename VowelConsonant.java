import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
			System.out.println("Enter a chracter to check it is vowel or consonant");
		char ch=ob.next().charAt(0);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		{
		System.out.println("The entered chracter"+ch+" is a vowel");
		}
		else
			{
		System.out.println("The entered chracter "+ch+" is a consonant");
		}
}		
}