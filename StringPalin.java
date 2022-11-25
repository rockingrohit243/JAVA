public class Main {
	public static void main(String[] args) {
		
		String str1="aba",str2="";
		
		for(int i=0;i<str1.length();i++)
		{
			char ch=str1.charAt(i);
			str2=ch+str2;
		}
		if(str1.equals(str2)==true)
		System.out.println("palindrome");
		else
		System.out.println("not");
	}
}