package Interface;

public class Son implements Father,Mother{

	public static void main(String[] args) {
    Son s=new Son();
    s.love();
    s.nature();
    s.money();
	}

	

	@Override
	public void love() {
    System.out.println("Mothers interface method completed in sons class");		
	}

	@Override
	public void nature() {
    System.out.println("Fathers interface method completed in sons class");		
	}



	@Override
	public void money() {
		// TODO Auto-generated method stub
		Father.super.money();
		Mother.super.money();
	}
	

}
