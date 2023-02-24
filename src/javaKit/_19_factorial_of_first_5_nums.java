// program that evaluates the factorial of the integers from 1 to 5.

package javaKit;

public class _19_factorial_of_first_5_nums {
    public static void main(String[] args) {
        int num, fact;

        num = 5;

        for(int i = 1; i <= num; i++) {
            fact = 1;
            for(int j = 1; j <= i; j++) {
                fact = fact*j;
            }
            System.out.println(i + "! = " + fact);
        }

    }
}
