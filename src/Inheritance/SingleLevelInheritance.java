package Inheritance;

public class SingleLevelInheritance {

	public static void main(String[] args) {
     Mother m=new Mother();
     
     m.Home();
     m.money();
     
     System.out.println("=============");
     
    son s=new son(); //created obj of child class
     s.Home(); //using superclass property
     s.money();//using superclass property
     s.mobile();//using own property
     s.laptop();//using own property
	}

}
