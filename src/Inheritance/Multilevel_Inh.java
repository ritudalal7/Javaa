package Inheritance;

public class Multilevel_Inh {

	public static void main(String[] args) {
     Grandmother g=new Grandmother();
     
       g.keys();
       g.recipe();
     
     System.out.println("===========");
     
     mother1 m1=new mother1();
     m1.Home();
     m1.money();
    
     
          System.out.println("===========");
          
     Son1 s1=new Son1();
     s1.mobile();
     s1.laptop();
     s1.Home();
     s1.money();
     s1.recipe();
     s1.keys();
	}

}
