// program to take n marks and print their average

import java.util.Scanner;

public class marks_average {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the total number of marks: ");
        int n = input.nextInt();

        int[] marks = new int[n];

        for(int i = 0; i < marks.length; i++) {
            System.out.println("Enter mark " + (i+1) + ": ");
            marks[i]  = input.nextInt();
        }

        double sum = 0;
        double average;
        for(int i = 0; i < marks.length; i++) {
            sum = sum + marks[i];
        }

        average = sum/n;
        System.out.println("Average of" + n + " numbers is " + average);
    }
}
