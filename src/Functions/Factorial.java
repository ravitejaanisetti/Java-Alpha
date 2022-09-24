package Functions;

import java.util.Scanner;

public class Factorial {
    public static int factorial(int n){
        int f=1;

        if(n==0){
            f=1;
        }
        for( int i=1; i<=n; i++){
            f*=i;
        }
        return f;
    }
    public static int binomialCoefficient(int n, int r){
        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int nmr_fact = factorial(n-r);

        int binCoeff = n_fact/(r_fact*nmr_fact);

        return binCoeff;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();

        int  fact = factorial(n);
        System.out.println("Factorial of "+n+" is "+fact);
        System.out.println("Binomial Coefficient is "+binomialCoefficient(n,r));
    }
}
