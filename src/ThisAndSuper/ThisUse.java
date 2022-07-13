package ThisAndSuper;

public class ThisUse {
	int a=10;//global variable
	static int b=90;//static global variable

	public static void main(String[] args) {
		
		ThisUse tu=new ThisUse();
		tu.test();
		

	}
	
	public void test()
	{
		int a=100;//local variable
		System.out.println("Local valie of a is"+a);
		System.out.println("Global value of a is"+this.a);
		
		int add1=1+a;
		System.out.println("Value of add1 is "+add1);
		
		int add2=1+this.a;//used global value of a
		System.out.println("Value of add2 is "+add2);
	}

}
