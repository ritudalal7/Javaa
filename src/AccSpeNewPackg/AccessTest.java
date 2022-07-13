package AccSpeNewPackg;

import AccessSpecifiers.Velocity;

public class AccessTest extends Velocity {

	public static void main(String[] args) {
		
		Velocity v=new Velocity();
	//	v.test1();//cant call private member
		//v.test2();//called default -->visible only withing pavkh
	//	v.test3();//calling protected -->visible only within packg-->inheritance will provide out of packg
		v.test4();//throught project
		
		AccessTest at=new AccessTest(); //object should be created of new class
				at.test3();
		        at.test4();
		

	}

}
