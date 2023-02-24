// Write a program to generate 5 Random nos. between 1 to 100, and it should not
//follow with decimal point. (Hint: Use rand ( ) function of Math class.

package javaKit;

public class _54_random_num_btw_0_and_100 {
    public static void main(String[] args) {

//        int random_num = (int)(100*Math.random());
//        System.out.println(random_num);

        for(int i = 0; i < 5; i++) {
            System.out.println((int)(100*Math.random()));
        }
    }
}
