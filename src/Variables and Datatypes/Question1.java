import java.util.Scanner;

public class Question1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value1:");
        int a = sc.nextInt();
        System.out.println("Enter value2:");
        int b = sc.nextInt();
        System.out.println("Enter value3:");
        int c = sc.nextInt();

        int average=((a+b+c)/3);

        System.out.println("Average of "+a+","+b+","+c+" is "+average);
    }
}