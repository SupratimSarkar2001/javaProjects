public class Discount {
  double amount = 0.0d,total = 0.0d;
  Discount(double amt){
      amount = amt;
  }
  void calc(){
      double discount = 0.0d;
      if(amount<=5000){
          total = amount;
      }
      else if(amount>5000 && amount<=10000){
          discount= 0.1*(amount-5000);
      }
      else if(amount>10000 && amount<=20000){
          discount = 0.2*(amount-10000);
      }
      else if(amount>20000 && amount <= 30000){
          discount = 0.3 * (amount-20000);
      }
      else {
          discount = 0.5 * (amount-30000);
          discount += 0.02*(amount);
      }
      total = amount - discount;
  }
  void display(){
      System.out.println("Purchase amount = "+amount);
      System.out.println("Discounted total = "+total);
  }
  public static void main(String args[]){
      Discount purchase1 = new Discount(35600);
      purchase1.calc();
      purchase1.display();
  }   
}