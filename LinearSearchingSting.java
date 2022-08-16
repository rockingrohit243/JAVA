import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		String name="Rohit";
		System.out.println("Input an char that you want to search");
		char target=ob.next().charAt(0);
		boolean ch=LinearSearch(name,target);
		System.out.println(ch);
       }
	static boolean LinearSearch(String name,char target)
	{
		if(name.length()==0)
	 	  return false;
	 //using for each loop	  
	//	for(int element : arr)
		  for(int i=0;i<name.length();i++)
		  	if(target==name.charAt(i))
		  	  return true;
		   
		   return false;
   }         
		  	  
}