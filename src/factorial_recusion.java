// program to find factorial of given number using recursion

public class factorial_recusion {

    public static void main(String[] args) {
        int ans = fact(5);
        System.out.println(ans);
    }

    public static int fact(int num) {
        if(num==0)
            return num;
        return fact(num-1)*num;
    }
}
