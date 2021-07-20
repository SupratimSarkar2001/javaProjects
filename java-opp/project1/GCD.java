package project1;

public class GCD {
	public static int g_c_d(int a,int b) {
		if(a==-1 || b==-1) {
			return -1;
		}
		else {
		if(b==0) {
			return a;
			
		}
		else {
			return g_c_d(b,a%b);
		}
		}
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int a=2;
		int b=0;
		int k=g_c_d(a,b);
		System.out.println(k);

	}

}
