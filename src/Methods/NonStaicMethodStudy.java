package Methods;

public class NonStaicMethodStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NonStaicMethodStudy obj=new NonStaicMethodStudy(); //created object
		obj.display(); //calling non static method from same class
		
		MyClass mc=new MyClass();
		mc.running();
		
	} 
	
	public void display() {
		System.out.println("Hi this this non static display method ");
	}

}
