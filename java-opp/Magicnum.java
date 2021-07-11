import java.util.Scanner;

public class Magicnum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number to check: ");
        int Number = scanner.nextInt();
        if(Magicnum(Number))
        System.out.println(Number + " is a magic number.");
        else
        System.out.println(Number + " isn't a magic number.");

        
    }
    
    public static boolean Magicnum(int Number){
        if( ((Number - 1)%9)==0)
        return true;
        else
        return false;
    }

}