import java.util.Scanner;
import java.util.Arrays;  
public class Anagram1{      
    public static void main (String [] args) {    
Scanner ob=new Scanner(System.in);      
System.out.println("Enter first string");
        String str1=ob.nextLine();
System.out.println("Enter the second string");
        String str2=ob.nextLine();
        str1 = str1.toLowerCase();  
        str2 = str2.toLowerCase();  
        if (str1.length() != str2.length()) {  
            System.out.println("Both the strings are not anagram");  
        }  
        else {  
            char[] string1 = str1.toCharArray();  
            char[] string2 = str2.toCharArray();  
            Arrays.sort(string1);  
            Arrays.sort(string2);  
 
            if(Arrays.equals(string1, string2) == true) {  
                System.out.println("Both the strings are anagram");  
            }  
            else {  
                System.out.println("Both the strings are not anagram");  
            }  
        }  
    }  
}  