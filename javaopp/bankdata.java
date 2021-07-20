package javaopp;
abstract class Bank{
	abstract void getBalance();
}
class BankA extends Bank{
	void getBalance() {
		System.out.println("$100");
	}
}
class BankB extends Bank{
	void getBalance() {
		System.out.println("$150");
	}
}
class BankC extends Bank{
	void getBalance() {
		System.out.println("$200");
	}
}
public class bankdata {
	public static void main(String[] args) {
		Bank b;
		b=new BankA();
		b.getBalance();
		b=new BankB();
		b.getBalance();
		b=new BankC();
		b.getBalance();
	}

}
