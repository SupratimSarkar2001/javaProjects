import java.util.*;
public class Userchoice {
    public static void primeSum(){
        double sum = 0.0d;
        for(int i=2;i<=100;i++){
            if(isPrime(i)==1){
                sum += i;
            }
        }
        System.out.println("Sum of Prime Numbers between 1 and 100 = "+sum);
    }
    public static int isPrime(int num){
        int i=1;
        for(i=2;i<=(num/2);i++){
            if(num%i==0) return 0;
        }
        return 1;
    }
    public static Boolean isAutomorphic(int num){ 
        int square = num * num;     
        while (num > 0)   
        {   
            if (num % 10 != square % 10){
                return false;
            }
               
            num = num/10;   
            square = square/10;   
        }   
        return true;  
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int choice;
        System.out.println("Enter 1 to print sum of prime numbers between 1 and 100");
        System.out.println("Enter 2 to check for automorphic number");
        choice = sc.nextInt();
        switch(choice){
            case 1:
                primeSum();
            break;
            case 2 :
                System.out.println("Enter integer to check if it is Automorphic:");
                int num = sc.nextInt();
                if(isAutomorphic(num)==true){
                    System.out.println("It is an automorphic number!");
                }
                else {
                    System.out.println("It is not an automorphic number!");
                }
            break;
            default :
            System.out.println("Invalid Choice!");
        }
        sc.close();
    }
}