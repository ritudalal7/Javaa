package Inheritance;

public class Hierachical_Inh {

	public static void main(String[] args) {
		Son2 s2=new Son2();
		s2.laptop();//own property
		s2.mobile();//own property
		s2.money();//super class property
		s2.Home();//superclass property
		
		System.out.println("=======");
		
	Daughter d=new Daughter();
	
	d.emotions();//own
	d.jewl();//own
	d.Home();//superclass pro
	d.money();//superclass pro

	}

}
