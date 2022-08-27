class X
{
	static void foo()
	{
		System.out.println("hello");
	}
	public static void main(String args[])
	{
		X.foo();
		foo();
		X ob=new X();
		ob.foo();
	}
}