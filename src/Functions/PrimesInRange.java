package Functions;

import java.util.Scanner;

import static Functions.isPrimeOptimised.*;

public class PrimesInRange {
    isPrimeOptimised isPrime = new isPrimeOptimised();

    public static void getPrimes(int n){
        for (int i=2; i<=n; i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println( "are prime numbers before "+n);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        getPrimes(n);

    }
}
