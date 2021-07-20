package project1;
// basically interface help us to inharite ... & it has a some abstract method..and we can make a object of a interface but we can 
// create a referacne,
interface abc{
	 int i=5;
	static void display() {
		System.out.println("display");
	}
	
}
/*interface xyz{
	default void display() {
		System.out.println(" in xyz ");
	}
}
//this is called implememntor class...
/*class xyz implements abc{
	public void show() {
		System.out.println(" hii");
	}
	public void display() {
		System.out.println("new display");
	}
}
*/

// for multiple interface implementor....

class implementor implements abc{

	/*@Override
	public void display() {
		System.out.println(" my display...");
	}*/
	
}
public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//abc obj=() -> System.out.println(" hii");
	
     /*  xyz obj= new xyz();
        obj.show();
        obj.display();*/
        
        //now if we dont need an implementor class...
		/*abc obj = new abc() {
			public void show() {
				System.out.println(" hii");
			}
		};*/
		//implementor obj = new implementor();
		//obj.show();
		abc.display();
		System.out.println(abc.i*2);
	}

}
