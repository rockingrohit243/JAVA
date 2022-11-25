class Parent{
	void run()
	{
		System.out.println("Heelo parent");
	}
}
public class Child extends Parent{
	
  void run()
  {super.run();
  	System.out.println("Hello child");
  }
  
	public static void main(String[] args) {
		Child ob=new Child();
		ob.run();
		}
}