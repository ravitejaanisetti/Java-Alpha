package Functions.Assignments;

import java.util.Scanner;

public class SumDigits {
    public static int getSum(int n){
        int sum =0;

        while(n!=0){
            int lastDigit = n%10;
            sum=sum+lastDigit;
            n=n/10;
        }

        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(getSum(n));

    }
}
