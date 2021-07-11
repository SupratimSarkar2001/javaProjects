//A shopkeeper offers 30% discount on purchasing articles whereas the other shopkeeper offers two
//successive discounts 20% and 10% for purchasing the same articles. Write a program in Java to
//compute and display the discounts. Take the price of an article as the input.
import java.util.*;
 class Discount{
     public static void main(String args[]){
         Scanner sc= new Scanner(System.in);
         System.out.println("enter the price :");
         double price=sc.nextDouble();

         double d1 = price * 30 / 100.0;
         double amt1 = price - d1;
         System.out.println("30% discount = " + d1);
         System.out.println("Amount after 30% discount = " + amt1);

         double d2 = price * 20 / 100.0;
         double amt2 = price - d2;
         double d3 = amt2 * 10 / 100.0;
         amt2 = amt2-d3;
         System.out.println("20% discount = " + d2);
         System.out.println("10% discount = " + d3);
         System.out.println("Amount after successive discounts = " + amt2);


     }
 }