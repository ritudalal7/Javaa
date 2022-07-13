package FinalKeyword;

public class Test {
	int c;

	 int a=100;
	final int b=10;

	public static void main(String[] args) {
		Test t=new Test();
		t.add();
		
 
	}
	public void add()
	{
		a=a+10;
		c=b+50;
	//	b=b+10;		//b is alrdy declared so we cant store value in b again
		System.out.println(a);
		System.out.println(c);
	}

}
