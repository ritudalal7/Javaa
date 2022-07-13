package typesOfVariable;

public class GlobalAndLocalVariable {

	int a=100; //global non static variable
	static int b=100; // global static variable
	
	
	public static void main(String[] args) {
		
		int a=10;
		GlobalAndLocalVariable gac=new GlobalAndLocalVariable(); //created object of class
		System.out.println("Value of a is  "+gac.a);  //calling non static global variable from same class
	    System.out.println("Value of b is "+b);  //calling static global variable from same class
	    System.out.println("value of static global variable from another class is " +Test.y);//calling static global variable from another class
	    Test t=new Test(); //created oject of another class
	    System.out.println("value of non static variable from another class"+t.x); //calling non static variable from anaother class
	    
	      int mul=b*gac.a;
	      int div=b/(Test.y);
	      int addition=gac.a+t.x;
	
	
	}
	
	
    public void addition()
    {
    	int p=10;
    	int sum=p+10;  //p is local variable known to addition method only
    	int sum1=a+100; //a is global variable known to whole class
    	
    }
	
    public void sub()
    {
    	int q=20;
    //	int sub1=p-q; //p is local variable pf another method 
    	int sub=a-q;  //a is global variable known to while class
    	
    }
    
}
