package javaopp;

class com{
	void compare(int a ,int b) {
		if(a>b) {
			System.out.println(a);
		}
		System.out.println(b);
	}
	void compare(char a ,char b) {
		if(a>b) {
			System.out.println(a);
		}
		System.out.println(b);
	}
	void compare(String a , String b) {
		if(a.length()> b.length()) {
			System.out.println(a);
		}
		else {
		System.out.println(b);
		}
	}
}

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		com c= new com();
		c.compare('a','c');
		c.compare(12,16);
		c.compare("hello","hi");
		
	}

}
