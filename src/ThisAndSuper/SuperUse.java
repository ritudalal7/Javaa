package ThisAndSuper;

public class SuperUse extends A {
      int p=120;//global variable from SuperUse class
      
      public static void main(String[]args)
      {
    	  SuperUse su=new SuperUse();
    	  su.test();
    	  
      }
      public void test()
    	  {
    	  int p=1;//local variable
    	  
    	  System.out.println("Local value of p is "+p);
    	  System.out.println("Global value of p from same class is "+this.p);
    	  System.out.println("Global value of p from super class "+super.p);
    		  
    	  }
    	  
     

}
