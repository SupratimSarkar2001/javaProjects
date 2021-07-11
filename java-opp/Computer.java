import java.lang.Math;
public class Computer {
 void compute(int target,char choice){
 if(choice=='s'){
 System.out.println("Square of integer is "+Math.pow(target,2));
 }
 else{
 System.out.println("Cube of integer is "+Math.pow(target,3));
 }
 }
 void compute(double target,char choice){
 if(choice=='v'){
 System.out.println("volume of cube is "+Math.pow(target,3));
 }
 else{
 System.out.println("diagonal of cube is "+(target*Math.sqrt(3)));
 } 
 }
 void compute(int length,int breadth,char choice){
 if(choice=='a'){
 System.out.println("area of rectangle is "+(length*breadth));
 }
 else{
 System.out.println("perimeter of rectangle is "+(2*(length+breadth)));
 } 
 }
 public static void main(String[] args) {
 Computer comp = new Computer(); 
 comp.compute(4.2d, 'v');
 comp.compute(10, 'c');
 comp.compute(5,12, 'a');
 }
}
