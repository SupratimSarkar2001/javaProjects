package project1;
class outer {
	static int x=10;
	inner i=new inner();
	class inner {
		int y=15;
		public void InnerDisplay() {
		 System.out.println(x+" "+y);
		}
	}
	public void outerDisplay() {
		i.InnerDisplay();
		System.out.println(i.y);
	}
}

public class NestedClass {


	public static void main(String[] args) {
		/*outer.inner obj=new outer().new inner();    -----if you want to call the inner display method only
		obj.InnerDisplay();*/ 
		outer obj=new outer();         //              ------if you want to call outer and inner both at a time
		obj.outerDisplay();
		
		// TODO Auto-generated method stub

	}

}
