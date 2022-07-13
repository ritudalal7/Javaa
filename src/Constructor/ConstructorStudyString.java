package Constructor;

public class ConstructorStudyString {
	
	String city,name;
	
	public ConstructorStudyString()
	{
		
		city="pune";
		name="Ritu";
		
	}
	
	public static void main(String[] args) {
		
		ConstructorStudyString cs1=new ConstructorStudyString();
		cs1.display();

	}
	
	public void display()
	{
		System.out.println("Iam non static method");
		System.out.println("I am from city "+city);
		System.out.println("My name is "+name);
	}
	

}
