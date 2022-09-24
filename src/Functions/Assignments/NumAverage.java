package Functions.Assignments;

import java.util.Scanner;

public class NumAverage {
    public static void getAverage(int a , int b, int c){
        int average = (a+b+c)/3;
        System.out.println("Average of the given numbers is "+average);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        getAverage(a,b,c);

    }
}
