package Functions;

import java.util.Scanner;

public class Product {
    public static int multiply(int a, int b){
        int product = a*b;

        return product;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int prod = multiply(a,b);
        System.out.println(a+"*"+b+" is "+prod);
    }

}
