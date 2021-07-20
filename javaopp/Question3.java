package javaopp;
import java.util.*;
public class Question3{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();

		int[] name = new int[length];
		int sum=0;
		try{
			for(int i=0;i<length;i++){
				int userInput=sc.nextInt();
				name[i] = userInput;
				sum=sum+name[i];
			}
			System.out.println(sum);
		}
		catch(InputMismatchException e) {
			System.out.println("You entered bad data.");
		}
	}
}
