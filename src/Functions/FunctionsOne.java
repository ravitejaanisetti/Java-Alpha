package Functions;

import java.util.Scanner;

public class FunctionsOne {
    public static void calculateSum(int a, int b){
        int sum = a+b;
        System.out.println("Sum is "+sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        calculateSum(a,b);

    }
}
