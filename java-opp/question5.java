//A businessman wishes to accumulate 3000 shares of a company. However, he already has some shares
//of that company valuing ₹10 (nominal value) which yield 10% dividend per annum and receive ₹2000
//as dividend at the end of the year. Write a program in Java to calculate the number of shares he has
//and how many more shares to be purchased to make his target.
//Hint: No. of share = (Annual dividend * 100) / (Nominal value * div%)


class Share{
    public static void main(String args[]) {
        int sharesHeld = (2000 * 100)/(10 * 10);
        System.out.println("No. of shares held currently = " 
            + sharesHeld);
        int sharesRequired = 3000 - sharesHeld;
        System.out.println("No. of shares to purchase = " 
            + sharesRequired);
    }
}