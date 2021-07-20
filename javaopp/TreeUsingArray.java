package javaopp;

public class TreeUsingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tree2 obj = new tree2();
		obj.root("a");
		obj.root_left("b", 0);
		obj.root_right("c", 0);
		obj.root_left("d", 1);
		obj.root_right("e", 1);
		obj.root_left("f", 2);
		obj.root_right("g", 2);
		obj.root_right("h", 3);
		obj.print();
		

	}
}	
class tree2{
		
		static int root = 0;
		static String[] arr= new String[10];
		public void root(String key) {
			arr[root]= key;
		}
		public void root_left(String key ,int parent) {
			int t= 2*parent+1;
			if(arr[parent] == null) {
				System.out.println("We cant able to put data");
				return;
				
			}
			else {
				arr[t]=key;
			}
		}
		public void root_right(String key ,int parent) {
			int t= 2*parent+2;
			if(arr[parent] == null) {
				System.out.println("We cant able to put data");
				return;
				
			}
			else {
				arr[t]=key;
			}
		}
		public void print() {
			for(int i=0 ;i<10;i++) {
				if(arr[i]!= null) {
					System.out.print(arr[i]);
				}
				else {
					System.out.print("-");
				}
			}
		}
	}


