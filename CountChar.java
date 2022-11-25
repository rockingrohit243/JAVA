import java.util.Scanner;
public class CountCharacter  
{  
    public static void main(String[] args) {  
    Scanner ob=new Scanner(System.in);
    System.out.println("enter the string");
        String string =ob.nextLine();  
        int count = 0,space=0,character=0;
        string=string.toLowerCase();
        for(int i = 0; i < string.length(); i++) {  
            if(string.charAt(i) =='a'||string.charAt(i)=='e'||string.charAt(i) =='i'||string.charAt(i)=='o'||string.charAt(i)=='u')
            {  
                count++;  
        }
        else if(string.charAt(i)==' ')
        {
        	space++;
        }
        else
         character++;
         
        }
        System.out.println("Total number of vowel in a string: " + count);  
        System.out.println("space ="+space);
        System.out.println("character="+character);
    }  
}