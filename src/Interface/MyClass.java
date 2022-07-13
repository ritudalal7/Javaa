package Interface;

public class MyClass implements MyInterface {

	public static void main(String[] args) 
	{
		
		MyClass m=new MyClass();
		m.test();
		m.test1();
//		a=a+10;--->a is final,we cant update value of a

	}
    public void test()
    {
	 System.out.println("test method completed in implementation class");
	}
    
    public void test1()
    {
    	System.out.println("test1 method completed in implementation class");
    }
}
