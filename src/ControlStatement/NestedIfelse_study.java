package ControlStatement;

public class NestedIfelse_study {

	public static void main(String[] args) {

		String UN="Velocity";
		String PWD="Velocity@23";
		
		if(UN=="Velocity")//outer loop
		{
			System.out.println("Enter password");
			
		if (PWD=="Velocity@123")
		{
			System.out.println("login succesfull");
		}
		else
		{
			System.out.println("password is incorrect");
		}
	}

	else {
		System.out.println("username is incorrcet");
	}
}
}