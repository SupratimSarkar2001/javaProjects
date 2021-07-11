//A shopkeeper offers 10% discount on the printed price of a Digital Camera. However, a customer
//has to pay 6% GST on the remaining amount. Write a program in Java to calculate the amount to be
//paid by the customer taking printed price as an input
import java.util.*;
class Gst{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the price :");
        double p = sc.nextDouble();
        double final_price =0.9*p+(0.06*0.9)*p;
        System.out.println("final price is :" + final_price);
    }
}