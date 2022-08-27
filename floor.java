import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		int i,num,digit,temp=0,block_code=0,floor_code=0,center_code=0;
		System.out.println("Enter the number");
		num=ob.nextInt();
		while(num!=0)
		 {
		 	digit=num%10;
		 	num=num/10;
		 	temp++;
		 	if(temp==1)
		 	 block_code=digit;
		 	else
		 	if(temp==2)
		 	 floor_code=digit;
		 	else
		 	if(temp==3)
		 	 center_code=digit;
		 	
		 	 
		 	
		}
		System.out.println("Visit block code: "+block_code+" floor code: "+floor_code+ "center code"+center_code);
	}
}