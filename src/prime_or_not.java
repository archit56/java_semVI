// program to find if the given number is prime or non-prime
public class prime_or_not {
	public static void main(String[] args) {
		
		int num = Integer.parseInt(args[0]);
		boolean isPrime = true;
		for(int i = 2; i <= num/2; i++) {
			if(num%i == 0) {
				isPrime = false;
				break;
			}
		}
		
		if(isPrime)
			System.out.println(num + " is prime");
		else
			System.out.println(num + " is not prime");
		
	}
}

// 