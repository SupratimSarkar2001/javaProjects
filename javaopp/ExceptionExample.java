package javaopp;

import java.nio.channels.AlreadyBoundException;

public class ExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
	    int arr[]=new int[8];
	    int arr2[]= null;
	    arr2[1]=4;
	    arr[9]=1;
        int a=7;
        int b=0;
        int ans=a/b;
       
		}
		catch(ArithmeticException  e) {
		System.out.println("you Can't devide it by zero");
		}
		catch(ArrayIndexOutOfBoundsException e) {
		System.out.println(" stay in your limit");
		}
		catch(NullPointerException e) {
			System.out.println("null point can't defined..");
		}
		catch(Exception e) {
			System.out.println("something wents wrong..");
		}
		finally {
        System.out.println(" hello");
		}
	}

}
