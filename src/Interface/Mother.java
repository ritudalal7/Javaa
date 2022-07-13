package Interface;

public interface Mother {
	void love();
	default void money()
	{
		System.out.println("Mothers money");
	}

}
