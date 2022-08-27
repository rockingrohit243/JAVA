public class Main {
  int x=10;
  int a=20;
  void sum()
  {
  	x++;
  	a++;
  }
  void display()
  {
  	System.out.println("The value of x:"+x+" and a is:"+a);
  }
}
class Rohit{
	
	public static void main(String[] args) {
		Main ob1=new Main();
		Main ob2=new Main();
		Main ob3=new Main();
		ob1.sum();
		ob2.sum();
		ob3.sum();
		ob1.display();
		ob2.display();
		ob3.display();
		
		
		
	}
}