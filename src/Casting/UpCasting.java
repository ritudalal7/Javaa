package Casting;

public class UpCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Father f=new Father();
		f.Bike();
		f.car();
		
		son s=new son();
		s.Bike();
		s.car();
		
		System.out.println("-------------");//up casting
		Father f1=new son();
		f1.Bike();
		f1.car();
    //    f1.education(); not eligble for casting because this method is not avaialble  in superclass
	}

}
//creating object of subclass and giving superclass reference