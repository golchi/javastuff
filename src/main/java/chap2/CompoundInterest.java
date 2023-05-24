package chap2;

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args){
        /*
        *   A is the amount of money in the account after the specified number of years.
            P is the principal amount that was originally deposited into the account.
            r is the annual interest rate.
            n is the number of times per year that the interest is compounded.
            t is the specified number of years.
        */
        double finalAmount, principalAmount, rAnnualInterestRate, nNumberCompounded, tNumberYears;

        Scanner inputHandler = new Scanner(System.in);

        System.out.println("---Compound Intesrest calcultation---");
        System.out.println("Please enter values below: ");

        System.out.print("Principal amount that was originally deposited into the account: ");
        principalAmount = inputHandler.nextDouble();

        System.out.print("Annual interest rate - 2 percent would be entered as 2 -: ");
        rAnnualInterestRate = inputHandler.nextDouble()/100;

        System.out.print("Number of times per year that the interest is compounded: ");
        nNumberCompounded = inputHandler.nextDouble();

        System.out.print("Number of years: ");
        tNumberYears = inputHandler.nextDouble();

        finalAmount = principalAmount * Math.pow( (1 + rAnnualInterestRate/nNumberCompounded),(nNumberCompounded*tNumberYears));

        System.out.print("\n The final amount is: " + String.format("%.2f", finalAmount));
    }
}
