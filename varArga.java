import java.util.Arrays;
public class Main {
	public static void main(String[] args) {
	
		fun(2,3,"ROHIT","JAGA");
		multiple(2,4,6,7,7,8,8,9,9,9,9,99,7);
	}
	static void fun(int a,int y,String ...x)
		 {
		 	System.out.println(a+" "+y+" "+Arrays.toString(x));
		 }
  static void multiple(int ...x1)
  {System.out.println(Arrays.toString(x1));
  }
}