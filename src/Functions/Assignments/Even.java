package Functions.Assignments;

import java.util.Scanner;

public class Even {
    public static boolean isEven(int n){
        boolean isEven = false;

        if(n%2==0){
            isEven = true;
        }
        return isEven;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Given number "+n+" "+" is Even "+ isEven(n));
    }
}
