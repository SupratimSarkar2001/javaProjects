package project1;

import java.util.Scanner;
interface Number1{
    int findSqr(int i);

}
class ram implements Number1{
 int i ,square;
 public int findSqr(int i){
     square=i*i;
     return square;
 }
}
public class Number{
    public static void main(String [] args){
        ram a=new ram();
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        System.out.print(a.findSqr(i));
    }
}
