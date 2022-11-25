import java.util.Scanner;
public class CountCharacter  
{  
    public static void main(String[] args) {  
    Scanner ob=new Scanner(System.in);
    System.out.println("enter the string");
        String string =ob.nextLine();  
        int count = 0;  
        for(int i = 0; i < string.length(); i++) {  
            if(string.charAt(i) !=' ')  
                count++;  
        }
        System.out.println("Total number of characters in a string: " + count);  
    }  
}