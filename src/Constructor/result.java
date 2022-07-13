package Constructor;

public class result
{
	int a,b,c;
	
	public result()//user defieed cosntructer
	{
		 a=10;
		 b=20;
		
	}

	public static void main(String[] args) 
	{
		result r1=new result();
		r1.display();

	}
	public void display()
	{
	 c=a+b;
	 System.out.println("result of c is "+c);
	}

}
