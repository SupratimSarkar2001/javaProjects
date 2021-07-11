//Mr. Agarwal invests certain sum at 5% per annum compound interest for three years. Write a program in Java to calculate:

//(a) the interest for the first year
//(b) the interest for the second year
//(c) the amount after three years.

//Take sum as an input from the user.
//Sample Input: Principal = ₹5000, Rate =10%, Time = 3 yrs
//Sample Output: Interest for the first year: ₹500
//Interest for the second year: ₹550
//Interest for the third year: ₹605

import java.util.Scanner;

class CompoundInterest
{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sum of money: ");
        double p = sc.nextDouble();
        double interest = p * 5 * 1 / 100.0;
        System.out.println("Interest for the first year = " + interest);
        p += interest;
        interest = p * 5 * 1 / 100.0;
        System.out.println("Interest for the second year = " + interest);
        p += interest;
        interest = p * 5 * 1 / 100.0;
        System.out.println("Interest for the third year = " + interest);
    }
}
