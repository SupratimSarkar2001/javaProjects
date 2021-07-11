import java.util.*;
public class magic {
    public int sum(){
        int s=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("how many no you want to put:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println("enter the number:");
            int a=sc.nextInt();
            s=s+a;
        }
        return s;
        
    }
    public void magicnum(){
        int n,remainder=1, number, sum=0;
        Scanner s= new Scanner(System.in);
        System.out.println("enetr the number:");
        n=s.nextInt();
        number=n;
        while(number>9){
            while(number>0){
                remainder=number%10;
                sum=sum+reminder;
                number=number/10;
            }
            number=sum;
            sum=0;
        }
        if(number==1){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
    public static void main(String[] args){
     magic obj= new magic();
       System.out.println(obj.sum());
       obj.magicsum();
        
    }
    
}
