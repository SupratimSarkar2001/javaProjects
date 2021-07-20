package projects2;


public class CurrentYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year;
		java.util.Calendar current =java.util.Calendar.getInstance();
		
		year = current.get(current.YEAR);
		int Month= current.get(current.MONTH);
		System.out.println("Current Year:"+ year);
		System.out.println("Current Month:"+(1+Month));

		

	}

}
