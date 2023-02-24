// application for calculating Compound-interest (interest rate of 5% for 10 years) with for loop.

package javaKit;
public class _20_compund_interest {
    public static void main(String[] args) {
        int p = 10000;
        double rate = 5;
        int time = 10;
        double amount;

        amount =  p*Math.pow(1 + (rate/100), time);
        System.out.println("Amount = " + amount);
    }
}




