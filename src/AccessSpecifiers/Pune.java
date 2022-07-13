package AccessSpecifiers;

public class Pune {

	public static void main(String[] args) {
		Velocity v=new Velocity();
		
	//	v.test1();// we can't call private member in public class
		v.test2(); //visible within pckg
		v.test3(); //visible within pckg
		v.test4(); //visible within pckg
	}

}
