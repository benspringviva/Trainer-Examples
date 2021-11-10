package Driver;

import java.util.ArrayList;

public class Q9 {

	public static void main(String[]arg) {
		
		ArrayList<Integer> myList = new ArrayList<Integer>();
		ArrayList<Integer> myPrimes = new ArrayList<Integer>();
		ArrayList<Integer> notPrimes = new ArrayList<Integer>();
		for (int i = 1; i<=100; i++) {
			myList .add(i);
		}
//System.out.println(myList);
		for (int primes : myList) {
			// bool to see if prime #
			boolean boolPrime = isPrime(primes);
			if (boolPrime) {
			//System.out.println("prime: "+primes);
			myPrimes.add(primes);
		} else {
			notPrimes.add(primes);
			
		}
		
		
		}//print out list to the console
		System.out.println("NotPrimes List:");
		System.out.println(notPrimes);
		
		
		System.out.println("Primes list:");
		System.out.print(myPrimes);
		}
// defines isPrime
	public static boolean isPrime(int value) {
		if (value == 1 || value == 0) return false;
		if (value == 2) return true;
		//check if multiple of 2
		if(value % 2 == 0) return false;
		// check if divisible odd number
		for (int i = 3; i* i<=value; i +=2) {
			if(value % i == 0)
				return false;
			 	
		}
		return true;
	}
}

