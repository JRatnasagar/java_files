package day1;

//scenario:7
	public class FirstTenPrimes {
	    public static void main(String[] args) {
	        int count = 0;  // Counter for the number of prime numbers found
	        for (int number = 2; count < 10; number++) {
	            if (isPrime(number)) {
	                System.out.println(number);
	                count++;
	            }
	        }
	    }

	    // Method to check if a number is prime
	    public static boolean isPrime(int num) {
	        if (num <= 1) {
	            return false;
	        }
	        for (int i = 2; i <= num / 2; i++) {
	            if (num % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }
	}

	

