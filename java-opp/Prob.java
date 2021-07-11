public class Prob {
 
    static boolean checkPrime(int numberToCheck)

    {

        if(numberToCheck == 1) {

            return false;

        }

        for (int i = 2; i*i <= numberToCheck; i++) {

            if (numberToCheck % i == 0) {

                return false;

            }

        }

        return true;

    }
 



    static int primeSum(int l, int r)

    {

        int sum = 0;

        for (int i = r; i >= l; i--) {
 

            // Check for prime

            boolean isPrime = checkPrime(i);

            if (isPrime) {
 

                // Sum the prime number

                sum = sum + i;

            }

        }

        return sum;

    }
    static void  sumisprime(int num){
        boolean flag=false;
        for (int i = 2; i <= num / 2; ++i) {
            // condition for nonprime number
            if (num % i == 0) {
              flag = true;
              break;
            }
          }
      
          if (!flag)
            System.out.println(num + " is a prime number.");
          else
            System.out.println(num + " is not a prime number.");
      


    

      

    }



    public static void main(String[] args)

    {

        int l = 3, r = 13;
 

        Prob obj=new Prob();
        int s=obj.primeSum(l, r);


        System.out.println(obj.primeSum(l, r));
        obj.sumisprime(s);

    }
}