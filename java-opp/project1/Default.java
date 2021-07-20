package project1;

interface first{
	default void show() {
		System.out.println("Default method implementation of First interface");
	}
}
interface second{
	default void show() {
		System.out.println("Default method implementation of second interface");
	}
}


class Default implements first,second {
	public void show() {
		first.super.show();
		second.super.show();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Default obj=new Default();
		obj.show();
		

	}

}