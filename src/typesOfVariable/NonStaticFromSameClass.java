package typesOfVariable;

public class NonStaticFromSameClass {
	
		int a=20; //Non static global variable 
		
		public static void main(String[] args) {
			
			NonStaticFromSameClass s= new NonStaticFromSameClass();
			s.display();
			s.display1();
			System.out.println("Value of a after calling is "+s.a);//calling Non static global variable from same class

			Study2 s2= new Study2();
			
			System.out.println("Value of p after calling is "+s2.p);//calling Non static global variable from another class
		}

		
		public void display()
		{
			int b=30;   // local variable
			System.out.println( "value of b is "+b);// value of b will be 30 for display method only
			System.out.println("Valuue of a is "+a);// value of a will be 20 for all methods
			
		}
		
		public void display1()
		{
			int c=40; // local variable
			int b=50;
			System.out.println( "value of b is "+b);
			System.out.println("value of c is "+c);
			System.out.println("Value of a is "+a);
			
		}
		
	}





