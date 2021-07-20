package projects2;

class ICARE1{
	class HIT{
		public void cse(){
			System.out.println("Computer Science Engineering");
		}

		public void ece(){
			System.out.println("Electronics and Communication Engineering");
		}

		public void ee(){
			System.out.println("Electrical Engineering");
		}

		public void me(){
			System.out.println("Mechanical Engineering");
		}


	}
}
public class ICARE{
	public static void main(String[] args) {
		ICARE1.HIT obj=new ICARE1().new HIT();

		obj.cse();
		obj.ece();
		obj.ee();
		obj.me();

	}
}
