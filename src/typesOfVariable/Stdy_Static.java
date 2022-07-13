package typesOfVariable;

public class Stdy_Static {

		static int a=40;// static global variable

		public static void main(String[] args) {
			
			Stdy_Static s= new Stdy_Static();
			s.display();
			System.out.println("value of a is "+a);// calling static global variable from same class
		
			
			System.out.println("value of p is "+stdy_static1.p);//calling static global variable from another class
		}
		
		public void display()
		{
			int b= 30;
			
			System.out.println("value of b is "+b); //  local variable
			System.out.println("value of a is "+a); //  static global variable
			
		}

	}
