package Functions;

import java.util.Scanner;

public class isPrimeOptimised {
    public static boolean isPrime(int n){
        boolean isPrime=true;
        if(n == 1){
            System.out.println(n+" is neither prime nor composite");
        }
        for (int i=2; i<=Math.sqrt(n); i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(isPrime(n));

    }
}
