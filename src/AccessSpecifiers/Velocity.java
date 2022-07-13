package AccessSpecifiers;

public class Velocity {

	public static void main(String[] args) {
		
		Velocity v=new Velocity();
		v.test1();
		v.test2();
		v.test3();
		v.test4();

	}

	private void test1()
	{
		System.out.println("I am private method");
	}
	
	void test2()
	{
		System.out.println("I am default method");
	}
	protected void test3()
	{
		System.out.println("I am protected method");
	}
	public void test4()
	{
		System.out.println("I am public method");
	}
}
	
	
