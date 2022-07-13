package Polymorphism;

public class Cmp_MethodOveroading {
	   //Declaring multiple methods with same method name but with differnt argument in same class is called method overloading//

	public static void main(String[] args) {
		
		Cmp_MethodOveroading m=new Cmp_MethodOveroading();
		m.add();
		m.add(10, 30);
	
		
	}
     public void add()
     {
    	 int a=10;
    	 int b=20;
    	 int sum=a+b;
    	 System.out.println("Value of sum is "+sum);
     }
     
     public void add(int a,int b)
     {
    	 int sum=a+b;
    	 System.out.println("Value of sum is "+sum);
     }
}
