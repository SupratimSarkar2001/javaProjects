import java.util.Scanner;

public class prime
{
    private int n;
    
    public void input() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        n = in.nextInt();
    }
    
    public void checkprime() {
        boolean isPrime = true;
        if (n == 0 || n == 1)
            isPrime = false;
        else {
            
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        
        if (isPrime)
            System.out.println("Prime Number");
        else
            System.out.println("Not a Prime Number");
    }
    
    public static void main(String args[]) {
        prime obj = new prime();
        obj.input();
        obj.checkprime();
    }
}