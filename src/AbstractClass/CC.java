package AbstractClass;

public class CC extends Sample{

	public static void main(String[] args) {
		
		CC c=new CC();
		c.test();//method from sample class
		c.test1();//method completed in concreate class
		c.demo();
		//c.demo1();

	}

	@Override
	public void test1() {
     System.out.println("This method is completed in concreate class");		
	}
	
	public void demo()
	{
		System.out.println("method from cc");
	}
	
	//public abstract demo1();
	

}
