package Constructor;

public class Add1 {
	
	int a,b,c;
	 
    public Add1() //user defined
    
    {
    	a=1;
    	b=2;
    }
    public static void main(String[] args)
    {
    	
    	Add1 a1=new Add1();
    	a1.display();
    	
    }
    
    public void display()
    {
    	c=a+b;
    	System.out.println("Sum of c is "+c);
    }
    
  
}


