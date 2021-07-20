package javaopp;
import java.util.*;
abstract class Shape{
	abstract double RectangleArea( double l,double b);
	abstract double SquareArea( double s);
	abstract double CircleArea(double r);
}
class a extends Shape{
	
	double RectangleArea( double l,double b) {
		return l*b;
	}
	double SquareArea( double s) {
		return s*s;
	}
	double CircleArea(double r) {
		return 2*Math.PI*r;
	}
	
}
public class Area {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		double l=sc.nextDouble();
		double b=sc.nextDouble();
		double s=sc.nextDouble();
		double r=sc.nextDouble();
		 Shape sh;
		 sh= new a();
		 double Ra,Sa,Ca;
		 Ra=sh.RectangleArea(l, b);
		 Sa=sh.SquareArea(s);
		 Ca=sh.CircleArea(r);
		 System.out.println("Rectangle Area:"+Ra);
		 System.out.println("Square Area:"+Sa);
		 System.out.println("Circle Area:"+Ca);
		 

	}

}
