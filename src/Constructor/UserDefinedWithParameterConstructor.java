package Constructor;

public class UserDefinedWithParameterConstructor
{
	int a;
	int b;
	int c;
	
	public UserDefinedWithParameterConstructor() //user defined without parameter constructor
	{
		a=10;
		b=20;
		c=30;
		
	}
	public UserDefinedWithParameterConstructor(int x)//user defined with o1 parameter constructor
	{
		a=x;
	}
	
	public UserDefinedWithParameterConstructor(int x,int y)//user defined with 2 paramter constructor
	{
		a=x;
		b=y;
	}
	
	public UserDefinedWithParameterConstructor(int x,int y,int z)//user defined with 3 paramter constructor
	{
		a=x;
	    b=y;
		c=z;
	}
	

	public static void main(String[] args) {
		UserDefinedWithParameterConstructor udc=new UserDefinedWithParameterConstructor();
         udc.multiplication();//calling method with 0 parameter constructor
         
          UserDefinedWithParameterConstructor udc1=new UserDefinedWithParameterConstructor(1000);
         udc1.multiplication();
         
         UserDefinedWithParameterConstructor udc2=new UserDefinedWithParameterConstructor(80,90);
         udc2.multiplication();
         
         UserDefinedWithParameterConstructor udc3=new UserDefinedWithParameterConstructor(20,30,40);
         udc3.multiplication();
         
         System.out.println("++++++++++++++");
         udc.addition();//calling method with 0 parameter constructor
         
         udc1.addition();
         
         udc2.addition();
         
         udc3.addition();
         
        } 
         
        public void multiplication()//method without parameter
	{
		int mul=a*b*c;
		System.out.println("multiplication  is "+mul);
		
	}
	public void addition()
	{
		int sum=a+b+c;
		System.out.println("addition is "+sum);
	}
}
