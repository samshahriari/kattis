import java.util.Arrays;
import java.util.Scanner;
/**
 * Implementation of the Sieve of Eratosthenes algorithm for checking if a
 * number is prime or not. The implementation is lacking in error-checking
 * and optimization, and needs some patching up!
 *
 * @author Sam Shahriari
 * @version 2020-11-11
 */
public class primesieve {
    //S.5
    private boolean[] primeCache = new boolean[0];


    /**
     * S.4 Check if a number is prime or not!
     *
     * Note that primeCache[n] denotes the primality of number n.
     *
     * @param number  An integer value to be checked for primality. 2 ≤ number ≤ 2^26
     * @return true if number is prime, false otherwise.
     */
    public boolean isPrime(int number) {
        //exceptionIfIllegalArg(number);
        //S.5
        if (number < primeCache.length) {
            return primeCache[number];
        }
        primeCache = sieve(number);
        return primeCache[number];
    }

    /**
     * Uses Sieve of Eratosthenes to check if numbers are prime or not
     *
     * @param number  highest number to check
     * @return an array with the primality of the numbers ≤ n
     */
    private boolean[] sieve(int number) {
        boolean[] prime = new boolean[number + 1]; // + 1 because of 0-indexing
        Arrays.fill(prime, true); // assume all numbers are prime
        int sqrt = (int) Math.floor(Math.sqrt(number));
        for (int i = 2; i <= sqrt; i++) {
            if (prime[i]) {
                for (int j = i*i; j < prime.length; j+=i) {
                    prime[j] = false; // mark multiples of i as not prime
                }
            }
        }
        return prime;
    }


    /**
     * Throws exception if the number is smaller than 2 or bigger than 2^26.
     *
     * @param number  the number to be checked
     */
    private void exceptionIfIllegalArg(int number) {
        //S.2
        if(number < 2) {
            System.err.println("The number must be higher than 1.");
            throw new IllegalArgumentException();
        }
        //S.3
        if(number > (int) Math.pow(2, 26)) {
            System.err.println("The number must be lower or equal to 2^26.");
            throw new IllegalArgumentException();
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        primesieve sieve = new primesieve();
        sieve.isPrime(scan.nextInt());
        int total = -2;
        for (boolean b : sieve.primeCache) {
            if (b) total++;
        }
        System.out.println(total);
    
        int tests = scan.nextInt();
        for(int i = 0; i< tests; i++) {
            int a = scan.nextInt();
            if(((!sieve.primeCache[a]))||a<2) System.out.println("0");
            else System.out.println("1");
        }
        scan.close();
    }
}
