// to print the product of odd numbers from 1 to 15
package javaKit;

public class _18_product_of_odd {
    public static void main(String[] args) {
        int product = 1;
        for(int i = 1; i<=15; i+=2) {
            product = product*i;
        }
        System.out.println(product);
    }
}
