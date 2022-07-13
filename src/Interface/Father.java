package Interface;

public interface Father {

	 void nature();
	 default void money()
	  {
		  System.out.println("Fathers money");
	  }
}
