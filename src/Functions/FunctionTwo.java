package Functions;

import java.util.Scanner;

public class FunctionTwo {
        public static int calculateSum(int a, int b){//parameters or formal parameters
            int sum = a+b;

            return sum;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int sum = calculateSum(a,b);//Arguments
            System.out.println(sum);

        }
    }


